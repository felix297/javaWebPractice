// 1. 转义字符

// 1.1 \'：下面这两个输出结果一样
// console.log("felix's wife");
// console.log("felix\'s wife");

// 1.2 \n：回车
// alert("felix\nmiraitowa");

// 1.3 \t：制表符
// console.log("felix\tmiraitowa");

// 1.4 \unicode
// console.log("\u4e2d");

// 2. 多行字符串
// 'use strict';
//
// let meg = `felix
// love
// miraitowa`;
//
// alert(meg);

//===============Array

// 多维数组

'use strict';

let multiDimensionArray = [[1,2,3], [4,5,6], [7,8,9]];

alert(multiDimensionArray.length);