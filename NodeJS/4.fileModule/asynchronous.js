//Import fs module
    const fs = require('fs');

// Reading data
    fs.readFile('data.txt', 'utf8', (err, data) => {
        if(err) {
            console.log(err);
        } else {
            console.log(data);
        }
    });
    console.log('This is some other operations');

// Write data
    fs.writeFile('data.txt', 'Data to be written', (err) => {
        if(err) {
            console.log(err);
        } else {
            console.log('File written successfully');
        }
    });
    console.log('This is some other operations');

// Update file
    fs.appendFile('data.txt', 'Data to be inserted', (err) => {
        if(err) {
            console.log(err);
        } else {
            console.log('File updated successfully');
        }
    });
    console.log('This is some other operations');

// Delete File
    fs.unlink('data.txt', (err) => {
        if(err) {
            console.log(err);
        } else {
            console.log('File Deleted Successfully');
        }
    });
    console.log('This is some other operations');