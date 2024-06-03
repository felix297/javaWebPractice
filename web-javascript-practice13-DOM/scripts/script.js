'use strict';

// window.document.getElementById("firstP").innerText="你好！";
// window.console.log(window.document.getElementById("firstP").innerText);

// window.document.getElementsByTagName("p")[0].innerText = "!";

// window.document.getElementsByClassName("h1")[0].innerText = "??????";

// window.document.querySelectorAll("#firstP.h1")[0].innerHTML = "querySelectorAll";
// window.document.querySelector("#firstP.h1").innerHTML = "querySelector";

// window.document.anchors["a1"].innerText = "a1";
// let arr = [1,2,3,4,5];
// alert(typeof arr);
// alert(typeof window.document.anchors);
// alert(document.baseURI);
// alert(document.anchors["top"].innerText)

// let x = document.anchors;
// for (let i = 0;i < x.length; i++) {
//     alert(x[i].tagName);
// }

// alert(document.doctype);
// alert(document.documentElement.tagName);

// alert(window.document.documentURI);
// alert(document.domain);
// alert(document.implementation);
// alert(document.inputEncoding);
// alert(document.lastModified)
// alert(document.readyState);
// alert(document.referrer);
// alert(document.URL);

// document.write(Date().toLocaleString());

let ele = document.getElementById("firstP");
ele.innerText = "nihao";

ele.id = "P";
let ele2 = document.getElementById("P");
alert(ele2.innerText);
alert(ele2.id);