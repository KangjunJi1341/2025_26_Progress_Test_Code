//import Feeds.TemperatureFeed;
//import Feeds.TemperatureSource;
//import Systems.Actuator;
//import Systems.Heater;
//import Systems.Heating;
//
//import javax.swing.*;
//import java.awt.*;
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Drawing extends JPanel{// inherience
//    // Fields
//    private ArrayList<Northward> northwards;   // private lists
//    private ArrayList<CentralWard> centralwards;
//    private ArrayList<SouthWard> southwards;
//
//    // Constructor
//    public Drawing(ArrayList<Northward> northwards, ArrayList<CentralWard> centralwards, ArrayList<SouthWard> southwards) {
//        this.northwards = northwards;
//        this.centralwards = centralwards;
//        this.southwards = southwards;
//    }
//
//    // Methods
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        // For Northward
//        for (Northward n : northwards) {
//            try {
//                boolean isInitiallyOn = true;
//                Actuator northactuator1 = new Actuator(20, boolean on, 1.0E-5F, -2.0E-5F);
//                northactuator1.setOn(isInitiallyOn);
//                Heating northheating = new Heating(20, boolean on, 1.0E-5F, -2.0E-5F);
//                TemperatureFeed northtem = new TemperatureFeed(northheating);
//                northtem.getTemp(0);
//                System.out.println("NorthWard Temperature is : " + northtem.getTemp(0));
//
//            }
//            catch (Exception e) {
//                System.out.println("Error in Obtain the temperature: " + e.getMessage());
//            }
//
//        }
//    }
//
//}