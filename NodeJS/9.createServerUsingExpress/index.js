// Import Express
import express from 'express';

// Create a Server
const server = express();

// Handle default request
server.get('/path', (req, res) => {
    res.send('Response Sent');
});

// Listen to specified port
server.listen(8080, () => {
    console.log('Server has started at port 8080');
});