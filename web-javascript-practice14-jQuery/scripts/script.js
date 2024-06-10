'use strict';

// $(document).ready(function() {
//     let ele = $("#p");
//     console.log(ele.text());
// });
//

// $(document).ready(function() {
//     $("#p").hide();
// });

// $(document).ready(function () {
//     console.log($("p#p").text());
//     $("[id]").hide();
// });

// $(document).ready(function() {
//     $("#p").css("color", "red");
// });

// $(document).ready(function () {
//     $(".p").css("color", "red");
// });

// $(document).ready(function () {
//     $("#p").click(function () {
//         $("#p").hide();
//     });
// });
//
// $(document).ready(function () {
//     $("#p2").dblclick(function() {
//         $("#p2").hide();
//     });
// });

// $(document).ready(function() {
//     $("#p").mouseover(function() {
//         $("#p").hide();
//     })
// })

// $(document).ready(function(){
//     $("#show").click(function () {
//         $("h1").show(100);
//     });
//
//     $("#hide").click(function () {
//         $("h1").hide(100);
//     });
//
//     $("#toggle").click(function(){
//         $("h1").toggle(1000);
//     });
// });

//
// $(document).ready(function () {
//     $("#fadeIn").click(function () {
//         $("h1").fadeIn();
//     });
//
//     $("#fadeOut").click(function () {
//         $("h1").fadeOut();
//     });
//
//     $("#fadeToggle").click(function () {
//         $("h1").fadeToggle();
//     });
//
//     $("#fadeTo").click(function () {
//         $("h1").fadeTo(1000, 0.5);
//     });
// });

// $(document).ready(function() {
//     $("#slideDown").click(function () {
//         $("h1").slideDown(1000);
//     });
//
//     $("#slideUp").click(function () {
//         $("h1").slideUp(1000);
//     });
//
//     $("#slideToggle").click(function() {
//         $("h1").slideToggle(1000);
//     });
// });

// $(document).ready(function (){
//     $("#playAnime").click(function() {
//         $("p").animate({
//             left: "200px",
//             height:"toggle",
//             width:"200px"
//         });
//     });
// });
// $(document).ready(function(){
//     $("button").click(function(){
//         $("p").animate({
//             left:'250px',
//             opacity:'0.5',
//             height:'150px',
//             width:'150px'
//         });
//     });
// });

// $(document).ready(function(){
//     $("#playAnime").click(function(){
//         let p = $("p");
//         p.animate({
//             height: "200px",
//         }, function () {
//             console.log("the animate is played 100%.");
//         });
//
//         p.animate({
//             width: "200px",
//         });
//     });
//
//     $("#stop").click(function () {
//         $("p").stop();
//     });
// });

// $(document).ready(function (){
//         $("#chaining").click(function () {
//             $("p").css("background-color","green").animate({height:"200px"}).animate({width:"100px"});
//         }
//     )
// });
//
// $(document).ready(function () {
//     // $("#getText").click(function () {
//     //     alert($("p").text());
//     // });
//     //
//     // $("#getHTML").click(function () {
//     //     alert($("p").html());
//     // });
//
//     // $("#getText").click(function () {
//     //     alert($("#input").val());
//     // });
//
//     $("#getText").click(function () {
//         alert($("#input").attr("id"));
//     });
// });
//
// $(document).ready(function(){
//     $("#btn").click(function () {
//         $("#input").val(prompt("please input your name"));
//     });
// });

// $(document).ready(function () {
//     $("#btnInnerText").click(function(){
//         $("p#innerText").text(function (i, originText) {
//             return originText + prompt("what are you want to say: ");
//         });
//     });
//
//     $("#btnInnerHTML").click(function(){
//         $("p#innerHTML").html(function (i, originHTML) {
//             let temp = prompt("please input the html you want to add: ");
//             return originHTML + temp;
//         });
//     });
// });

// document.getElementById("innerText").style.font = "10px consolas, sans-serif";
// document.getElementById("p5").onclick = sayHello;
// function sayHello () {
//     alert("hello!");
// }

// document.getElementById("btn1").addEventListener("click", function () {alert("you clicked me!")});

// document.getElementById("btn1").addEventListener("click", function (){alert("first");});
// document.getElementById("btn1").addEventListener("click", clickMe);
//
// function clickMe() {
//     alert("second");
// }

// document.getElementById("btn1").addEventListener("mouseover", mouseOver);
// document.getElementById("btn1").addEventListener("mouseout", mouseOut);
// function mouseOver() {
//     alert("mouse is over");
// }
//
// function mouseOut() {
//     alert("mouse is down");
// }

// window.addEventListener("resize", function () {
//     document.getElementById("p1").innerText += "您改变了窗口大小";
// });

// document.getElementById("p1").addEventListener("click", clickP, false);
// // document.getElementById("btn1").addEventListener("click", clickBtn, true);
//
// function clickP () {
//     alert("you clicked a paragraph");
// }
//
// function clickBtn () {
//     alert("you clicked a button");
// }

// alert(document.getElementsByTagName("p")[0].parentNode.tagName)

// alert(document.body.nodeName)

// alert(document.body.innerHTML)
// alert(document.documentElement.innerHTML)
// alert(document.getElementsByTagName("p")[0].nextElementSibling.innerHTML)
// alert(document.body.nodeName)
// alert(document.documentElement.nodeName)
// document.getElementsByTagName("p")[0].id = "first";
// alert(document.getElementById("first").id)

// alert(document.getElementsByTagName("p")[0].getAttributeNode("id").nodeName)
// alert(document.getElementsByTagName("p")[0].firstChild.nodeName)
// alert(document.documentElement.nodeName)

let ele_node = document.getElementsByTagName("p")[0]
let attr_node = document.getElementsByTagName("p")[0].getAttributeNode("id");
let text_node = document.getElementsByTagName("p")[0].firstChild;
console.log("======= node value ========");
console.log("value of element node: " + ele_node.nodeValue)
console.log("value of attribute node: " + attr_node.nodeValue)
console.log("value of text node: " + text_node.nodeValue)
console.log("======= node type ========");
console.log("type of element node: " + ele_node.nodeType);
console.log("type of attribute node: " + attr_node.nodeType);
console.log("type of text node: " + text_node.nodeType);
console.log("type of document node: " + document.documentElement.nodeType)
console.log('type of document: ' + document.documentElement.parent.nodeType)