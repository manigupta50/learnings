// Import Path Module
const path = require('path');

const filePath = path.join('src', 'home', 'data.txt'); // for path from the current directory
const filePathR = path.resolve('src', 'home', 'data.txt'); // for absolute path from the root part of the OS

console.log(filePath);
console.log(filePathR);
console.log(path.extname(filePath)); // To know the extension of the file in the path