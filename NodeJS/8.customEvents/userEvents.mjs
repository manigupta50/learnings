import Events from 'events';

export class UserEvents extends Events.EventEmitter {
    // event
    createPost(event) {
        console.log('Post is created');
        console.log(event);
        this.emit('nameOfTheEvent');
    }
}