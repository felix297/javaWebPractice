'use strict';

// let info = new Map([["felix", 23], ["miraitowa", 23], ["frank", 40]]);
// console.log(info.get("felix"));
// info.set("tom", 10)
// console.log(info.get("tom"));
// info.delete("tom");
// console.log(info.get("tom"));

// alert(info.size);
// info.clear();
// alert(info.size);

// alert("has felix? " + info.has("felix"));
// alert("has tom? " + info.has("tom"));

// alert(typeof info);

// let toString = "| ";
//
// function join (value, key) {
//     toString = toString + key + ": " + value + " | ";
// }
// info.forEach(join);
// alert(toString);

// for(let ele of info.values()) {
//     console.log(ele);
// }

let felix = {
    name: "felix",
    age: 23,
    email: "felixzxy29@gmail.com"
}

let miraitowa = {
    name: "miraitowa",
    age: 23,
    email: "miraitowa29@gmail.com"
}

let tom = {
    name: "tom",
    age: 10,
    email:"tom29@gmail.com"
}

let student = new Set([felix, miraitowa, tom]);

// student.add("a");
// alert(student.size);

// for (let ele of student.keys()) {
//     console.log(ele);
// }
// for (let ele of student.values()) {
//     console.log(ele);
// }
// for (let ele of student.entries()) {
//     console.log(ele);
// }

let nums = [1,2,3,4,5,6];
for (let ele of student) {
    console.log(ele);
}