/**
 *問１
 */
 let numbers = [2, 5, 12, 13, 15, 18, 22];
 //ここに答えを実装してください。↓↓↓
 function isEven() {    
     //拡張for文
     for(let i in numbers){
         if(numbers[i] % 2 == 0){       
             console.log(numbers[i] + 'は偶数です');
        }
    }
}
isEven();

/**
 * 問2
 */
class Car{
    constructor(gas,num){
        this.gas = gas;
        this.num = num;
    }
    
     getNumGas(){
        console.log(`ガソリンは${this.gas}です。ナンバーは${this.num}です`);
    }
}
    
let newCar = new Car('オート',100);
newCar.getNumGas();


