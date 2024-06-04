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

$(document).ready(function() {
    $("#slideDown").click(function () {
        $("h1").slideDown(1000);
    });

    $("#slideUp").click(function () {
        $("h1").slideUp(1000);
    });

    $("#slideToggle").click(function() {
        $("h1").slideToggle(1000);
    });
});