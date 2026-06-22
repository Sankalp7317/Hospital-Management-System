package hospital.management.system;

import javax.swing.*;
import java.awt.*;

public class new_patient extends javax.swing.JFrame {

    JComboBox comboBox;
    JTextField textFieldNumber, textName, textFieldDisease,textFieldDeposit;
    JRadioButton r1,r2;
    Choice c1;
    JLabel date;
    JButton b1,b2;

    new_patient(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setBackground(new Color(1,55,85));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/patient.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel lable = new JLabel(imageIcon1);
        lable.setBounds(550,150,200,200);
        panel.add(lable);

        JLabel labelName = new JLabel("New Patient Form");
        labelName.setBounds(118,11,260,53);
        labelName.setForeground(Color.white);
        labelName.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(labelName);

        JLabel labelID = new JLabel("ID :");
        labelID.setBounds(35,76,200,14);
        labelID.setForeground(Color.white);
        labelID.setFont(new Font("Tahoma",Font.BOLD,16));
        panel.add(labelID);

        comboBox = new JComboBox(new String[]{"Aadhar Card", "Voter ID", "Driving License"});
        comboBox.setBounds(271,72,150,20);
        comboBox.setBackground(Color.WHITE);
        comboBox.setForeground(Color.BLACK);
        comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(comboBox);

        JLabel labelNumber = new JLabel("Number :");
        labelNumber.setBounds(35,110,200,14);
        labelNumber.setForeground(Color.white);
        labelNumber.setFont(new Font("Tahoma",Font.BOLD,16));
        panel.add(labelNumber);

        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(271,110,150,20);
        panel.add(textFieldNumber);

        JLabel labelName1 = new JLabel("Name :");
        labelName1.setBounds(35,150,200,14);
        labelName1.setForeground(Color.white);
        labelName1.setFont(new Font("Tahoma",Font.BOLD,16));
        panel.add(labelName1);

        textName = new JTextField();
        textName.setBounds(271,150,150,20);
        panel.add(textName);

        JLabel labelGender = new JLabel("Gender :");
        labelGender.setBounds(35,190,200,14);
        labelGender.setForeground(Color.white);
        labelGender.setFont(new Font("Tahoma",Font.BOLD,16));
        panel.add(labelGender);

//        comboBox = new JComboBox(new String[]{"Male", "Female","LGBTQ"});
//        comboBox.setBounds(271,190,150,20);
//        comboBox.setBackground(Color.WHITE);
//        comboBox.setForeground(Color.BLACK);
//        comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
//        panel.add(comboBox);

        r1 = new JRadioButton("Male");
        r1.setBounds(271,190,100,20);
        r1.setBackground(new Color(1,55,85));
        r1.setForeground(Color.white);
        panel.add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(350,190,100,20);
        r2.setBackground(new Color(1,55,85));
        r2.setForeground(Color.white);
        panel.add(r2);

        JLabel labelDiesase = new JLabel("Diesase :");
        labelDiesase.setBounds(35,230,200,14);
        labelDiesase.setForeground(Color.white);
        labelDiesase.setFont(new Font("Tahoma",Font.BOLD,16));
        panel.add(labelDiesase);

        textFieldDisease =  new JTextField();
        textFieldDisease.setBounds(271,230,150,20);
        panel.add(textFieldDisease);

        JLabel labelRoom =  new JLabel("Room :");
        labelRoom.setBounds(35,270,200,14);
        labelRoom.setForeground(Color.white);
        labelRoom.setFont(new Font("Tahoma",Font.BOLD,16));
        panel.add(labelRoom);

//        room choice




        setSize(850,550);
        setLayout(null);
        setLocation(300,250);
        setVisible(true);
    }
    public static void main(String[] args) {
        new new_patient();
    }
}
