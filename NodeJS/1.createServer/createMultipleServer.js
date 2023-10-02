// Create a server using NodeJS

// 1. Import http library/module
const http = require("http");

// 2. Create Server
const server = http.createServer((req, res) => {

    res.write('This is my application.'); //This is also a response but it adds up with end response, we are not ending the response here
    if(req.url == '/product') {
        return res.end('This is Product page'); // Sending Response to Request
    }
    else if(req.url == '/user') {
        return res.end('This is User page');
    }

    res.end('This is main page');
});

// 3. Specify a port to listen to client's request
server.listen(8080, () => {
    console.log('Server running at port 8080');
});