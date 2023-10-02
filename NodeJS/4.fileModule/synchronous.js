// Import fs(File System) module
    const fs = require('fs');

// To read the file content using blocking code
    console.log('Starting code');
    const buffer1 = fs.readFileSync('data.txt');
    console.log(buffer1.toString());
    console.log('This is some other operation');
                    //OR
    console.log('Starting code');
    const buffer2 = fs.readFileSync('data.txt', {encoding: 'utf-8'});
    console.log(buffer2);
    console.log('This is some other operation');


// To create a file
    try {
        console.log('Starting code');
        fs.writeFileSync('data.txt', 'data to be written in the file');
    } catch(err) {
        console.log(err);
    }
    console.log('This is some other operation');


// To append more data in the created file
    try {
        fs.appendFileSync('data.txt', '\nadd more data');
    } catch(err) {
        console.log(err);
    }


// To delete a file
    try {
        fs.unlinkSync('data.txt');
    } catch(err) {
        console.log(err);
    }