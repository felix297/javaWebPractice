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

$(document).ready(function () {
    // $("#getText").click(function () {
    //     alert($("p").text());
    // });
    //
    // $("#getHTML").click(function () {
    //     alert($("p").html());
    // });

    // $("#getText").click(function () {
    //     alert($("#input").val());
    // });

    $("#getText").click(function () {
        alert($("#input").attr("id"));
    });
});