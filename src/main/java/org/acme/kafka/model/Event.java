package org.acme.kafka.model;

public class Event {

    public String id;
    public String message;
    public String timestamp;
    public Payload payload;

    /**
    * Default constructor required for Jackson serializer
    */
    public Event() { }

    public Event(String id, String message, String timestamp, Payload payload) {
        this.id = id;
        this.message = message;
        this.timestamp= timestamp;
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", message=" + message + '\'' +
                ", timestamp=" + timestamp + '\'' +
                ", payload=" + payload.toString() +
                '}';
    }
}