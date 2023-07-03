package org.acme.kafka.model;

public class Payload {

    public long temperature;
    public long humidity;
    public long pressure;
    public long luminosity;


    /**
    * Default constructor required for Jackson serializer
    */
    public Payload() { }

    public Payload(long temperature, long humidity, long pressure, long luminosity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.luminosity = luminosity;
    }

    @Override
    public String toString() {
        return "Event{" +
                "temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                ", pressure='" + pressure + '\'' +
                ", luminosity=" + luminosity +
                '}';
    }
}



