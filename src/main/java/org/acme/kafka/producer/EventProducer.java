package org.acme.kafka.producer;

import java.util.Random;
import java.util.UUID;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.acme.kafka.model.Payload;

import org.eclipse.microprofile.reactive.messaging.Outgoing;
import java.time.Instant;
import io.smallrye.mutiny.Multi;
import io.smallrye.reactive.messaging.kafka.Record;

@Path("/events")
@ApplicationScoped
public class EventProducer {

    @POST
    @Path("/send")
    @Outgoing("<TOPIC_NAME>")
    @Produces
    public Multi<Record<String, Payload>> generate() {
        UUID uuid = UUID.randomUUID();
        String timestamp = Instant.now().toString();
        Payload payload = new Payload(timestamp
            , new Random().nextLong()
            , new Random().nextLong()
            , new Random().nextLong()
            , new Random().nextLong());
        return Multi.createFrom().item(Record.of(uuid.toString(), payload));
    }
}
