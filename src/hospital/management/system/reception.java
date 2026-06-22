package hospital.management.system;

import javax.swing.*;
import java.awt.*;

public class reception extends JFrame {

    reception(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,200,1895,795);
        panel.setBackground(new Color(1,55,85));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,1895,190);
        panel1.setBackground(new Color(1,55,85));
        add(panel1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dr2.png"));
        Image image = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel lable = new JLabel(i2);
        lable.setBounds(1700,0,250,250);
        panel1.add(lable);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/amb2.png"));
        Image image2 = i11.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i22 = new ImageIcon(image2);
        JLabel label1 = new JLabel(i22);
        label1.setBounds(1250,0,600,200);
        panel1.add(label1);



        setSize(1920,1080);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new reception();

    }
}