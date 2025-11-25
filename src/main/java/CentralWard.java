public class CentralWard extends TemperatureSensor{ //Inherience
    // Fields
    private int CentralID;

    // Constructor
    public CentralWard(String name, int temperature, int CentralID){
        super(name, temperature);
        this.CentralID = CentralID;
    }
}
