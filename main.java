import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.ClassNotFoundException;


public class main {
    public static void main(String[] args) {

        ScientificCalculator scientificCalculator = new ScientificCalculator();

        scientificCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scientificCalculator.setSize(400, 350);
        scientificCalculator.setVisible(true);
        scientificCalculator.setBackground(Color.RED);


    }
}
