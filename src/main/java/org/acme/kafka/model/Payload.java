package org.acme.kafka.model;

public class Payload {

    public String timestamp;
    public long temperature;
    public long humidity;
    public long pressure;
    public long luminosity;


    /**
    * Default constructor required for Jackson serializer
    */
    public Payload() { }

    public Payload(String timestamp, long temperature, long humidity, long pressure, long luminosity) {
        this.timestamp = timestamp;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.luminosity = luminosity;
    }

    @Override
    public String toString() {
        return "Event{" +
                "timestamp='" + timestamp + '\'' +
                "temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                ", pressure='" + pressure + '\'' +
                ", luminosity=" + luminosity +
                '}';
    }
}



