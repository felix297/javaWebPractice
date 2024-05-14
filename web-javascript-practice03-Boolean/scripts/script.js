'use strict';
let name = Number.NaN;
// alert(Boolean( 5 < 4));
// alert(5 < 4);
// alert((5 < 4));
// alert(Boolean(100));
// alert(Boolean(3.14));
// alert(Boolean(-15));
// alert(Boolean("felix"));
// alert(Boolean("false"));
// alert(Boolean(3 + 4));
// alert(Boolean(5 > 6));
// alert(Boolean(0));
// alert(Boolean(""));
// alert(Boolean(name));
let falseObj = new Boolean(false);
let falseVal = false;
if (falseObj == falseVal) {
    alert("falseObj == falseVal");
} else {
    alert("falseObj !== falseVal");
}

if (falseObj === falseVal) {
    alert("falseObj === falseVal");
} else {
    alert("falseObj !=== falseVal");
}