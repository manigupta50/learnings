import { UserEvents } from "./userEvents.mjs"; // Importing the UserEvent class
const userEvents = new UserEvents(); // Creating an object for UserEvent class

function addToDatabase() {
    console.log('Content is added to database');
}

function sendNotifications() {
    console.log('Send Notifications');
}

function updateTimeline() {
    console.log('Updating timeline');
}

userEvents.addListener('nameOfTheEvent', addToDatabase);
userEvents.addListener('nameOfTheEvent', sendNotifications);
userEvents.addListener('nameOfTheEvent', updateTimeline);

userEvents.createPost('This is my first post');