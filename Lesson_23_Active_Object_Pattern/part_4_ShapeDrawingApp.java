import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeDrawingApp {
    public static void main(String[] args) {
        ActiveShape activeShape = new ActiveShape();

        JFrame frame = new JFrame("Shape Drawing");
        JButton circleButton = new JButton("Draw Circle");
        JButton squareButton = new JButton("Draw Square");

        circleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                activeShape.drawShape("Circle");
            }
        });

        squareButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                activeShape.drawShape("Square");
            }
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(circleButton);
        frame.add(squareButton);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
