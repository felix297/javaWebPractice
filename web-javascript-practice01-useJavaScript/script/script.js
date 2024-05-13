'use strict';
let msg=
    `hello
            world
           你好呀
           JavaScript`;


console.log(msg);

console.log("Test01\'test");
console.log("Test01\ntest");
console.log("Test01\ttest");
console.log("\u4e2d");

var age = 18;

// if 判断跟java 一摸一样
if (age < 18) {
    console.log("you are not an adult!");
} else {
    console.log("you are an adult!");
}

if (age == "18") {
    console.log("age == 18");
}

// 三个等于才会保证跟 java
if (age === '18') {
    console.log("age === 18");
}

if (NaN == NaN) {
    console.log("NaN == NaN");
} else {
    console.log("NaN != NaN");
}

// NaN 跟 NaN 也不相等
if (NaN === NaN) {
    console.log("NaN == NaN");
} else {
    console.log("NaN != NaN");
}

var num1 = 1/3;
var num2 = 1 - 2/3;

console.log(1/3);
console.log(1-2/3);

if (num1 === num2) {
    console.log("num1 === num2");
} else {
    console.log("num1 != num2");
}

var obj1 = null;
var obj2;

console.log("obj1: " + obj1);
console.log("obj2: " + obj2);

var arr = [1, 1.2, -2, 1e3, "felix", "miraitowa", true, false , null , undefined];

for (var i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}

var person = {
    name: "felix",
    age: 23,
    height: 181
}
console.log(person.age);
console.log("name: " + person.name);
console.log(person.height);

i = 1;


let mailContent = `
felix
love
miraitowa ;

and 

xpp is mine!@
`;

console.log(mailContent);


let num3 = 1.2;

let msg3 = `my age is : ${num3}`;

console.log(msg3[1]);

console.log(`the second letter in this sentense is: ${msg3[1]}`);

msg3.toUpperCase();
console.log(num3);
console.log(num3.toFixed(2));
console.log(isFinite(num3));

Number.is

