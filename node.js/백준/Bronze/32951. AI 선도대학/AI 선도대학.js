const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString();
const n = parseInt(input, 10);
const year = 2024;

console.log(n - year);