let arr = [1, 2, 3, 4, 5, 6];
let arr2 = [7, 8, 9];
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

let iterator = arr.entries();

for (ele of iterator) {
    console.log(ele);
}