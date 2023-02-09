var app = new Vue({
    el: '#app',
    data: {
        list: [],
        addText: '',
        count: 0,
        searchText: '',
    },
    //watchでlistの変更を監視
    watch: {
        list: {
            handler: function() {
                //localStorageにデータを保存
                localStorage.setItem("list", JSON.stringify(this.list));
            },
            deep: true
        }
    },
    //マウントされた時にlocalStorageからデータを取得
    mounted: function() {
        this.list = JSON.parse(localStorage.getItem("list")) || [];
    },
    methods: {
        addToDo: function() {
            if (this.addText !== '') {
                this.list.push({
                    text: this.addText, 
                    isChecked: false,
                });
            }
            this.addText = '';
        },
        deleteBtn: function() {
            this.list = this.list.filter(function(todo) {
                return !todo.isChecked;
            });
        }
    },

    computed: {
        task: function(){

            for(var i in this.list){
        
                if(this.list[i].isChecked == false){
                    this.count++;
                }
            }
            return this.count;

        },

        searchToDo: function(){
            
            var list =[];

            for(var i in this.list){
                var todo = this.list[i].text;

                if(todo.indexOf(this.searchText) !== -1){
                    list.push({
                        text: todo,
                        isChecked: false, 
                    });
                }
                console.log(todo);
                console.log("格納された配列の長さ" + list.length);

            } 
            return list;
            
        }
    }
    
});