import java.awt.*;

public abstract class TemperatureSensor { // Abstraction
    // Fields
    private String name;
    private int temperature;

    // Constructor
    public TemperatureSensor(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;

    }

    // Methods
    // getter
    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }

}
