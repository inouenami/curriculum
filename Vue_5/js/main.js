var app = new Vue({
    el:"#app",
    data: {
        item1: "",
        item2: ""
    },

    //合計を出す算出プロパティ
    computed:{
        total: function(){
            return Number(this.item1) + Number(this.item2);
        }
    }

});