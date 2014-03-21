package com.abhirockzz.blog.oimagination;


import javax.enterprise.event.Event;
import javax.inject.Inject;


//Event producer class - responsible for intercepting the events and catapulting them for consumption

public class BusinessEventProducer {
    
    @Inject
    Event<BusinessEvent> eventSink;
    
    public void produceEvent(){
        
        //a business event e.g. a user creation event
        BusinessEvent userCreationEvent = new BusinessEvent();
        
        //notify the observers
        //Note: No explicit oberserver 'registration' required - power of Java EE and CDI !
        eventSink.fire(userCreationEvent);
    }
}
