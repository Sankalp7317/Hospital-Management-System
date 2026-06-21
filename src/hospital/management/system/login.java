package hospital.management.system;

import javax.swing.*;
import java.awt.*;

public class login extends JFrame {

    JTextField textField;
    JPasswordField jPasswordField;
    JButton b1,b2;

    login(){

        JLabel namelabel = new JLabel("UserName");
        namelabel.setBounds(40,20,100,30);
        namelabel.setFont(new Font("Tahoma",Font.BOLD,16));
        namelabel.setForeground(Color.black);
        add(namelabel);

        JLabel passlable = new JLabel("Password");
        passlable.setBounds(40,70,100,30);
        passlable.setFont(new Font("Tahoma",Font.BOLD,16));
        passlable.setForeground(Color.black);
        add(passlable);

        textField = new JTextField();
        textField.setBounds(150,20,150,30);
        textField.setFont(new Font("Tahoma",Font.PLAIN,16));
        textField.setBackground(new Color(255,255,255));
        add(textField);

        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(150,70,150,30);
        jPasswordField.setFont(new Font("Tahoma",Font.PLAIN,16));
        jPasswordField.setBackground(new Color(255,255,255));
        add(jPasswordField);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel lable = new JLabel(imageIcon1);
        lable.setBounds(320,-30,400,300);
        add(lable);

        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,16));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,16));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);

        getContentPane().setBackground(new Color(109,164,170));
        setSize(750,300);
        setLocation(400,270);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args){
        new login();
    }
}
