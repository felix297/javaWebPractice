// let nums = [18, 58, 20, 39, 18];
// let fruit = ["apple", "banana", "pineapple", "apple"];
// let name = "felix";

// for (let i = 0; i < arr.length; i++) {
//     console.log(arr[i]);
// }

// alert(arr.length);

// let arr4 = arr.concat(arr2, arr3);
// for (let i = 0; i < arr4.length; i++) {
//     console.log(arr4[i]);
// }

// arr.copyWithin(2, 0, 2);
// for (let i = 0; i < arr.length; i ++) {
//     console.log(arr[i]);
// }

// arr.copyWithin(3, 1);
//
// for (let i = 0; i < arr.length; i++) {
//     console.log(arr[i]);
// }

// let iterator = arr.entries();
//
// for (ele of iterator) {
//     console.log(ele);
// }

// function lt18 (age) {
//     return age >= 18;
// }

// function equal (age, index, arr) {
//     if (index === 0) {
//         return true;
//     } else {
//         return age === arr[index - 1]
//     }
// }
//
// alert(arr.every(equal));

// arr.fill(1, 2, 5);
//
// for (let i = 0; i < arr.length; i++) {
//     console.log(arr[i]);
// }

// function over18 (age) {
//     return age > 18;
// }
//
// alert(arr.filter(over18));

// function over18 (age) {
//     return age > 18;
// }
//
// alert(arr.find(over18));

// function over18 (age) {
//     return age > 18;
// }
//
// alert(arr.findIndex(over18));

// function times (ele, index) {
//     arr[index] = arr[index] * 10;
// }
//
// function print(ele) {
//     console.log(ele);
// }
//
// arr.forEach(times);
// arr.forEach(print);

// let arr4 = Array.from("felix");
// for (let i = 0; i < arr4.length; i++) {
//     console.log(arr4[i]);
// }

// alert(fruit.includes("apple", fruit.length - 2));

// alert(fruit.lastIndexOf("apple", 2));

// let nameLetter = Array.from(name);
//
// alert(nameLetter.join(" and "));

// let iterator = fruit.keys();
//
// for (ele of iterator) {
//     console.log(ele);
// }

// let iterator = fruit.values();
//
// for (ele of iterator) {
//     console.log(ele);
// }

// let nums = [4, 9, 16, 25];
//
// let res = nums.map(Math.sqrt);
//
// for (ele of res.entries()) {
//     console.log(ele);
// }

// function times10 (num) {
//     return num * 10;
// }
//
// let res = nums.map(times10);
//
// for (let i = 0; i < res.length; i++) {
//     console.log(res[i]);
// }

// let person = [{firstName: "Micheal", lastName: "Liao"}, {firstName: "Felix", lastName: "Zeng"}, {firstName: "Miraitowa", lastName: "Xu"}];
//
// function getFullName (ele) {
//     return [ele.firstName, ele.lastName].join(" ")
// }
//
// alert(person.map(getFullName));

// let fruit = ["apple", "banana", "pineapple"];
//
// alert(fruit.pop());
//
// alert(fruit);

// let fruit = ["apple", "banana", "pineapple"];
//
// alert(fruit.shift());
//
// alert(fruit);

// let fruit = [];
//
// fruit.push("apple");
//
// alert(fruit);
//
// alert(fruit.push("banana", "orange"));
//
// alert(fruit);

// let fruit = [];
//
// fruit.unshift("apple");
// alert(fruit);
//
// alert(fruit.unshift("pineapple", "orange"));
// alert(fruit);

// let nums = [10, 2, 3];
//
// function sum (total, num) {
//     return total + num;
// }
//
// alert(nums.reduce(sum));

// let nums = [1, 3, 5];
//
// function minus (total, num) {
//     return total - num;
// }
//
// alert(nums.reduce(minus));

// let nums = [1.1];
//
// function roundAndSum (total, num) {
//     return total + Math.round(num);
// }
//
// alert(nums.reduce(roundAndSum));

// let nums = [1, 3, 5];
//
// function minus (total, num) {
//     return total - num;
// }
//
// alert(nums.reduceRight(minus));

// let nums = [1, 3, 5];
//
// function minus (total, num) {
//     return total - num;
// }
//
// alert(nums.reduceRight(minus, 0));

// let fruit = ["apple", "banana", "pineapple"];
//
// alert(fruit.reverse());

// let fruit = ["apple", "banana", "pineapple"];
//
// let res = fruit.slice(-1, fruit.length);
//
// alert(res);

// let ages = [1, 18, 3, 4, 5, 9];
//
// function lt18 (age) {
//     return age >= 18;
// }
//
// alert(ages.some(lt18));

// let fruit = ["banana", "apple", "pineapple"];
//
// fruit.sort();
// alert(fruit);

// let nums = [45, 1000, 3, 2, 90];
//
// nums.sort();
// alert(nums);

// let nums = [45, 1000, 3, 2, 90];
//
// function compare (num1, num2) {
//     return num1 - num2;
// }
//
// nums.sort(compare);
// nums.reverse();
//
// alert("the maximum number is: " + nums[0]);
// alert("the minimum number is: " + nums[nums.length - 1]);


// let nums = [45, 1000, 3, 2, 90];
//
// function compare (num1, num2) {
//     return num2 - num1;
// }
//
// nums.sort(compare);
// alert(nums);

let company = ["microsoft", "apple", "google", "aoc"];

company.splice(3, 1, "xiaomi", "oppo");
alert(company);