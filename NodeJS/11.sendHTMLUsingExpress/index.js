const express = require('express');

const server = express();

server.get('/', (req, res) => {
    res.send('Welcome to Express');
});

/* Static files are in public folder which can be accessed directly
    It will be directly accessible at - localhost:8080/index.html */ 
server.use(express.static('public'));

server.listen(8080, () => {
    console.log('Server started at port 8080');
});