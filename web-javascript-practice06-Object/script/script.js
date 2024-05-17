'use script';

let felix = {
    name: "felix",
    age: 23,
    height: 181
}

felix.score = 100;
// alert(felix.score);
delete felix.name;
// alert(felix.name);
felix.weight = 55;
// alert(felix.weight);

// alert("score" in felix);
alert(felix.hasOwnProperty('weight'));