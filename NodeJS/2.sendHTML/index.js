// Create a server using NodeJS

// 1. Import http library/module
const http = require("http");
const fs = require("fs");

// 2. Create Server
const server = http.createServer((req, res) => {
    const data = fs.readFileSync('index.html').toString();
    res.end(data);
});

// 3. Specify a port to listen to client's request
server.listen(8080, () => {
    console.log('Server running at port 8080');
});