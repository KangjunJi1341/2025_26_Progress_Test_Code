import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Tem_show {
    // Fields
    private JFrame frame;
    private ArrayList<Northward> northwards;   // private lists
    private ArrayList<CentralWard> centralwards;
    private ArrayList<SouthWard> southwards;

    // Constructor
    public Tem_show() {
        frame = new JFrame("Temperature Show");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(1, 3, 10, 10));
        frame.getContentPane().setBackground(Color.red);
        frame.setVisible(true);
    }

    // Methods
    public void show() {
        // Northward
        JLabel northward = new JLabel();
        northward.setText("<html>Name: Northward <br>Degree: 23 degrees centigrade</html>");
        frame.add(northward);

        // Centeral
        JLabel Centeralward = new JLabel();
        Centeralward.setText("<html>Name: Centeralward <br>Degree: 22 degrees centigrade</html>");
        frame.add(Centeralward);

        // Southward
        JLabel Southward = new JLabel();
        Southward.setText("<html>Name: Southward <br>Degree: 20 degrees centigrade</html>");
        frame.add(Southward);
    }

}

