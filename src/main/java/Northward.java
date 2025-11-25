import java.awt.*;

public class Northward extends TemperatureSensor{ //Inherience
    // Fields
    private int NorthID;

    // Constructor
    public Northward(String name, int temperature, int NorthID){
        super(name, temperature);
        this.NorthID = NorthID;
    }

    // Methods
    // getter
    public int getNorthID() {
        return NorthID;
    }






}
