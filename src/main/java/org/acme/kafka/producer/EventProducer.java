package org.acme.kafka.producer;

import java.util.UUID;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.acme.kafka.model.Event;
import org.acme.kafka.model.Payload;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@Path("/events")
public class EventProducer {

    @Channel("event-sample")
    Emitter<Event> eventEmitter; 

    /**
     * Endpoint to generate a new Event and send it to "event-sample" Kafka topic using the emitter.
     */
    @POST
    @Path("/send")
    @Produces(MediaType.TEXT_PLAIN)
    public String send() {
        UUID uuid = UUID.randomUUID();
        String message = "hello";
        String timestamp = "xxxxxx";
        Payload payload = new Payload(0L,0L,0L,0L);
        Event event = new Event(uuid.toString(), message, timestamp, payload);
        eventEmitter.send(event); 
        return event.toString(); 
    }
}