// Create a server using NodeJS

// 1. Import http library/module
const http = require("http");

// 2. Create Server
const server = http.createServer((req, res) => {
    res.end('Welcome to NodeJS Server'); // Sending Response to Request
});

// 3. Specify a port to listen to client's request
server.listen(8080, () => {
    console.log('Server running at port 8080');
});