// //グローバルコンポーネント
// Vue.component('alert-component',{
//     template: `
//     <div class="alert" v-on:click="caution">
//     hello!
//     <div>
//     `
// ,
// methods:{
//     caution: function(){
//         alert('クリックされました');
//     }
// }
// });

var app = new Vue({
    el: '#app',
    data:{

    },
//ローカルコンポーネント
    components: {
        'hello-world':{
            template: `<h1> hello world <h1>`
        }
    }
});