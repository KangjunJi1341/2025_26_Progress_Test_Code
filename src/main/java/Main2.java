import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        // Define Objects
        ArrayList<Northward> northwards = new ArrayList<>(); // Parametric Poly, easy to add
        ArrayList<CentralWard> centralwards = new ArrayList<>();
        ArrayList<SouthWard> southwards = new ArrayList<>();

        Northward northward1 = new Northward("Northward", 23, 0);
        CentralWard centralward1 = new CentralWard("Centralward", 22, 1);
        SouthWard southward1 = new SouthWard("SouthWard", 20, 2);
        northwards.add(northward1);
        centralwards.add(centralward1);
        southwards.add(southward1);

        // Create the frame
        JFrame frame = new JFrame("Sensor Check");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(3, 1)); // layout grid
    }
}
