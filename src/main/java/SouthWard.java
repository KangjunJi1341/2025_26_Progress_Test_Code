import java.awt.*;

public class SouthWard extends TemperatureSensor{ // Inherience
    // Fields
    private int SouthID;

    // Constructor
    public SouthWard(String name, int temperature, int SouthID){
        super(name, temperature);
        this.SouthID = SouthID;
    }
}
