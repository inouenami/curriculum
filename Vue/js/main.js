var app = new Vue({
    el: '#app',
    computed: {
        data: function() {
            console.log("computed");
            return Math.random();
        }
    },

    methods: {
        getData: function() {
            console.log("method");
            return Math.random();
        }
    }
});