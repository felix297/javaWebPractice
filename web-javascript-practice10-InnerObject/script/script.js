'use strict';

// console.log(typeof 123);
// console.log(typeof "123");
// console.log(typeof true);
// console.log(typeof NaN);
// console.log(typeof {});
// console.log(typeof []);
// console.log(typeof Math.abs);

// let date = new Date();
// let date1 = new Date(2001, 6, 1, 4, 15, 29, 123);
// let date12= new Date(2001, 5, 1, 4, 15, 30);
// let date13 = new Date(1, 23);
// let date14 = new Date(21, 23);
// let date2 = new Date(1341234124);
// let date3 = new Date(-1341234124);
// console.log(date);
// console.log(date1);
// console.log(date2);
// console.log(date12);
// console.log(date2);
// console.log(date2.toString());
// console.log(date2.toDateString());
// console.log(date2.toTimeString());

// let date = new Date("2024-5-17");
// let date2 = new Date("2024-5");
// let date3 = new Date("2024");
//
// console.log(date);
// console.log(date2);
// console.log(date3);

// let date = new Date("2024-05-17T11:10:30");
// console.log(date);

// let date = new Date();

// console.log(date.getDate());
// console.log(date.getDay());
// console.log(date.getTime());
// console.log(date.getFullYear());
// console.log(date.getHours());
// console.log(date.getMonth());
// console.log(date.getMilliseconds());
// console.log(date.getMinutes());
// console.log(date.getSeconds());

// date.setDate(30);
// console.log(date.getDate());
// date.setTime(31412341234);
// console.log(date.getTime());
// date.setFullYear(2023);
// date.setMonth(5);
// date.setDate(5);
// date.setHours(12);
// date.setMinutes(30);
// date.setSeconds(34);
// date.setMilliseconds(123);
// console.log(date.toString());
// let date2 = new Date(date);
// date2.setMinutes(31);
//
// if (date < date2) {
//     alert(date.toDateString() + " is earlier than " + date2.toDateString());
// } else {
//     alert(date.toDateString() + " is later than " + date2.toDateString());
// }

// alert(Date.now());

// let date = Date.parse("June 1, 2001");
// console.log(date);

// let birth = new Date(date);
// console.log("normal string: " + birth);
// console.log("ISO string: " + birth.toISOString());
// console.log("UTC string: " + birth.toUTCString());
// console.log(birth.toLocaleString());
// console.log(birth.toLocaleDateString());
// console.log(birth.toLocaleTimeString());
// console.log(birth.toJSON());

let felix = {
    name: "felix",
    age: 23
}
let nums = [1,2,3];
let msg = JSON.stringify(nums);
alert(msg);

alert(typeof JSON.parse("[1,3,4]"));