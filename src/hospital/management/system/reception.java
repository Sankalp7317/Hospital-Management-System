package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        JButton btn1 = new JButton("Add New Patient");
        btn1.setBounds(20,15,200,30);
        btn1.setBackground(Color.WHITE);
        panel1.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new new_patient();
            }
        });

        JButton btn2 = new JButton("Room");
        btn2.setBackground(Color.WHITE);
        btn2.setBounds(20,58,200,30);
        panel1.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton btn3 = new JButton("Department");
        btn3.setBackground(Color.WHITE);
        btn3.setBounds(20,100,200,30);
        panel1.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton btn4 = new JButton("All Employee Information");
        btn4.setBackground(Color.WHITE);
        btn4.setBounds(270,15,200,30);
        panel1.add(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton btn5 = new JButton("Patient Information");
        btn5.setBackground(Color.WHITE);
        btn5.setBounds(270,58,200,30);
        panel1.add(btn5);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton btn6 = new JButton("Patient Discharge");
        btn6.setBackground(Color.WHITE);
        btn6.setBounds(270,100,200,30);
        panel1.add(btn6);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton btn7 = new JButton("Update Patient Details");
        btn7.setBackground(Color.WHITE);
        btn7.setBounds(510,15,200,30);
        panel1.add(btn7);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton btn8 = new JButton("Hospital Ambulance");
        btn8.setBackground(Color.WHITE);
        btn8.setBounds(510,58,200,30);
        panel1.add(btn8);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton btn9 = new JButton("Search Room");
        btn9.setBackground(Color.WHITE);
        btn9.setBounds(510,100,200,30);
        panel1.add(btn9);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton btn10 = new JButton("LogOut");
        btn10.setBackground(Color.WHITE);
        btn10.setBounds(750,58,200,30);
        panel1.add(btn10);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });


        setSize(1920,1080);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new reception();

    }
}