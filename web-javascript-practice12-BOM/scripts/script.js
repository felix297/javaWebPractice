'use strict';

// window.alert("hello");
// window.alert("innerWidth: " + window.innerWidth);
// window.alert("innerHeight: " + window.innerHeight);

// window.open();
// window.close();

// window.alert("height: " + screen.height);
// window.alert("width: " + screen.width);
// window.alert("available height: " + screen.availHeight);
// window.alert("available width: " + screen.availWidth);
// window.alert("color depth: " + screen.colorDepth);
// window.alert("pixel depth: " + screen.pixelDepth);

// window.console.log("url: " + window.location.href);
// window.console.log("hostname: " + window.location.hostname);
// window.console.log("port: " + window.location.port);
// window.console.log("path: " + window.location.pathname);
// window.console.log("protocol: " + window.location.protocol);
// window.location.assign("https://www.baidu.com");

// window.history.back()
// window.history.forward();

// window.alert(window.navigator.cookieEnabled);
// window.alert(window.navigator.appName);
// window.alert(window.navigator.appCodeName);
// window.alert(window.navigator.product);
// window.alert(window.navigator.appVersion);
// window.alert(window.navigator.userAgent);
// window.alert(window.navigator.platform);
// window.alert(window.navigator.language);
// window.alert(window.navigator.onLine);
// window.alert(window.navigator.javaEnabled());

// window.alert("Hello!\nWelcome to my site!");
// if (window.confirm("if you want to go to www.baidu.com")) {
//     window.location.assign("https:\\www.baidu.com");
// }
//
// let name = window.prompt("please input your name", "traveler");
// if (name != null) {
//     window.alert("Hello! " + name + "!");
// }

// let count = 0;
// function counter () {
//     window.console.log(count);
//     return count++;
// }
// let timeout = setTimeout(counter, 100);
// let timeInterval = setInterval(counter, 1000);
// 在终端进行 clearInterval() 操作

// document.cookie = "first name=felix; expires=Sun, 31 Dec 2017 12:00:00 UTC; path=/";
// document.cookie = "first name = felix; last name = zeng" // 不会添加两个键值对到 document.cookie 里面，只会添加第一个键值对就去，如果想要添加两个键值对到 document.cookie 里面，就要分两次。
// document.cookie = "last name = zeng";
// document.cookie = "last name = xu";
// document.cookie = "time = now; expires = expires=Thu, 01 Jan 1970 00:00:00 UTC"
// alert(document.cookie);
let username = window.prompt("please input the username: ");

function setCookie (username) {
    let res_username = "username=" + username + "; ";
    let timeNow = new Date();
    let expireDays = 7;
    timeNow.setTime(timeNow.getTime() + expireDays*24*60*60*1000);
    let res_expires = "expires=" + timeNow.toUTCString() + "; ";
    let res_path = "path=/"
    document.cookie = res_username + res_expires + res_path;
}

setCookie(username);

alert(document.cookie);