// import http from 'http';
const http = require('http');

const server = http.createServer((req, res) => {
    if(req.method == 'POST') {
        console.log(req.body);
        let body = '';

        req.on('data', (chunk) => {
            body += chunk.toString();
        });

        req.on('end', () => {
            console.log(body);
            res.end('All the data is received');
        });
    }

    if(req.method == 'GET') {
        console.log('GET END');
        res.end('Response end sent from GET');
    }
});

server.listen(8080, () => {
    console.log('Server started at port 8080');
});