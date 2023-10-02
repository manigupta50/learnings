import express from 'express';

const server = express();

function firstMiddleware(req, res, next) {
    console.log('First Middleware');
    next();
}

function secondMiddleware(req, res, next) {
    console.log('Second Middleware');
    next();
}

function globalMiddleware(req, res, next) {
    console.log('Global Middleware');
    next();
}

// This will execute for all the requests.
server.use(globalMiddleware);

//route-level middlewares will execute for send(path) requests.
server.get('/send', [firstMiddleware, secondMiddleware], (req, res) => { 
    res.send('Hello! This is Express Server');
});

