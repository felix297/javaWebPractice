'use strict';

// function sum (num1, num2) {
//     if (typeof num1 != "number") {
//         throw "Not a Number";
//     }
//
//     if (typeof num2 != "number") {
//         throw "Not a Number";
//     }
//     for (let i = 0; i < arguments.length; i++) {
//         console.log(arguments[i]);
//     }
//     return num1 + num2;
// }
//
//
// console.log(sum(1,2));


// function sum (num1, num2, ...rest) {
//     for (let i = 2; i < arguments.length; i++) {
//         console.log(arguments[i]);
//     }
// }
//
// sum(1,2,3,4,5,6,7,8,9);

// var felix = {};
// felix.length = 18;
//
// function print () {
//     let length = 9;
//     console.log(length);
// }
// print();
// console.log(felix.length);
// console.log("window: " + window.felix.length);
// window.alert(window.felix.length);
// const PI = 3.14;
//
// function test() {
//     for (var i = 0; i < 10; i++) {
//         console.log(i);
//     }
//     console.log(i + 10);
// }
//
// alert(PI);

// function in a object
// let felix = {
//     name: "felix",
//     birth: 2001,
//     getAge: function () {
//         let yearNow = new Date().getFullYear();
//         return yearNow - this.birth;
//     },
//     getName: function() {
//         return this.name;
//     }
// }
//
// alert(felix.getName());

// function getAge () {
//     let yearNow = new Date().getFullYear();
//     return yearNow - this.birth;
// }

// let felix = {
//     name: "felix",
//     birth: 2000,
//     age: getAge
// };
//
// console.log(felix.age());
// console.log(getAge());

// let felix = {
//     name: "felix",
//     birth: 2000
// };
//
// felix.age = getAge.apply(felix);
// alert(felix.age);