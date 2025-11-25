import Feeds.TemperatureFeed;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Show the temperaure snesor scene
        while (true) {
            try {
                Tem_show temperature_sensor = new Tem_show();
                temperature_sensor.show();

            } catch (Exception e) {
                System.out.println("Refresh error: " + e.getMessage());
            }
        }

    }
}
