'use strict';
// function run () {
//     console.log(this.name + " is running...");
// }
// let student = {
//     name: "felix",
//     age: 23,
//     run: run
// };
//
// let bird = {
//     name:
//
// };
//
// let felix = {
//     name: "tom",
//     age: 14
// };
//
// felix.__proto__ = student;
//
// let tom = {
//     name: "jerry"
// };
// run.apply(tom);

// let person = {name: "felix", age: 23, run: function () {console.log(this.name + " is running...");},
//     date: new Date()
//
// };
// let person2 = {
//     name: "miraitowa",
//     age: 23,
//     run: function () {
//         console.log(this.name + " is running...");
//     }
// }
// let person3 = new Object();
// person3.name = "tom";
// person3.age = 23;
// person3.run = function () {
//     console.log(this.name + " is running...");
// }

// person.run();
// person2.run();
// person3.run();

// let felix = person;
// felix.run();
// felix.name = "tom"
// felix.run();
// person.run();

// console.log(person["name"])
// for (let index in person) {
//     console.log(person[index])
// }

// let msg = "name: " + person.name + ", " + "age: " + person.age;
// alert(msg);
//
// let msg = "";
// for (let index in person) {
//     msg += index + ": " + person[index] + " ";
// }
//
// alert(msg);

// let myArr = Object.values(person);
// let nums = [1,2,34];
//
// for (let ele in nums.values()) {
//     console.log(ele);
// }

// for (let ele of nums.entries()){
//     console.log(ele);
// }

// alert(typeof myArr);
// for (let ele of myArr) {
//     console.log(ele);
// }

// let msg = JSON.stringify(person);
// alert(msg);

// let person = {
//     get name() {
//         return this.name;
//     },
//
//     get age () {
//         return this.age;
//     },
//
//     set name (name) {
//         this.name = "name";
//     },
//
//     set age(age) {
//         this.age = age;
//     }
// }
//
// let counter = {
//     count: 0,
//
//     set increment (step) {
//         if (stop === null) {
//             step = 1;
//         }
//
//         this.count = this.count + step;
//     },
//
//
// }
//
// counter.increment = null;
// alert(counter.count);
//
// function Person (name, age, eyeColor)
// {
//     this.name = name;
//     this.age = age;
//     // this.inch = this.age/3;
//     this.eyeColor = eyeColor;
//     this.setName = function (_name) {
//         this.name = _name;
//     }
// }
// Person.prototype.inch = this.age/3;
//
// let felix = new Person("felix", 24, "brown");
// alert(felix);

// felix.run = function () {
//     console.log(felix.name + " is running...");
// }
//
// felix.run();

// felix.setName("miraitowa");
// console.log(felix.name);

// console.log(felix.inch);

// function Person (name, age, eyeColor) {
//     this.name = name;
//     this.age = age;
//     this.inch = this.age/3;
//     this.eyeColor = eyeColor;
// }
//
// let felix = new Person("felix", 24, "brown");
// console.log(felix.inch);








































