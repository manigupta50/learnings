// 1. Import nodemailer
const nodemailer = require('nodemailer');

// 2.Configure Email and Send
async function sendMail() {
    // 1. Create an Email Transporter.
    // SMTP (Simple Mail Transfer Protocol)
    const transporter = nodemailer.createTransport({
        service: 'gmail',
        auth: {
            user: 'cnsender2@gmail.com',
            pass: 'qrqulwdosrfoimld',
        }
    });

    // 2. Configure Mail Content
    const mailOptions = {
        from: 'cnsender2@gmail.com',
        to: '',
        subject: '',
        text: ''
    };

    // 3. Send the Email
    try {
        const result = await transporter.sendMail(mailOptions);
        console.log('Email sent successfully');
    } catch(err) {
        console.log('Email send failed with error: ' + err);
    }
}

sendMail();