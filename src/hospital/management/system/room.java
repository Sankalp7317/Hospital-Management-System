package hospital.management.system;

import javax.swing.*;
import java.awt.*;

public class room extends JFrame {
    room(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(1,55,85));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/roomm.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);




        setSize(900,600);
        setLayout(null);
        setLocation(300,230);
        setVisible(true);

    }

    public static void main() {
        new room();

    }

}
