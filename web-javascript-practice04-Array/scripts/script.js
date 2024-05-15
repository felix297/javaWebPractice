let arr = [18, 58, 20, 39, 18];
let fruit = ["apple", "banana", "pineapple"];
let arr3 = [10, 11, 12];

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

function times (ele, index) {
    arr[index] = arr[index] * 10;
}

function print(ele) {
    console.log(ele);
}

arr.forEach(times);
arr.forEach(print);