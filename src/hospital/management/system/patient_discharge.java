package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class patient_discharge extends JFrame {

    patient_discharge(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,790,390);
        panel.setLayout(null);
        panel.setBackground(new Color(1,55,85));
        add(panel);

        JLabel label = new JLabel("Check-Out");
        label.setBounds(100,20,200,20);
        label.setFont(new Font("Tahoma",Font.BOLD,20));
        label.setForeground(Color.white);
        panel.add(label);

        JLabel label1 = new JLabel("Customer ID");
        label1.setBounds(30,80,150,20);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        label1.setForeground(Color.white);
        panel.add(label1);

        Choice choice = new Choice();
        choice.setBounds(200,80,150,25);
        choice.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(choice);

        try{
            connection c = new connection();
            ResultSet result = c.statement.executeQuery("select * from Patient_Info");
            while(result.next()){
                choice.add(result.getString("number"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel label2 = new JLabel("Room Number");
        label2.setBounds(30,130,150,20);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        label2.setForeground(Color.white);
        panel.add(label2);

        JLabel RNo = new JLabel();
        RNo.setBounds(200,130,150,20);
        RNo.setFont(new Font("Tahoma",Font.BOLD,14));
        RNo.setForeground(Color.white);
        panel.add(RNo);

        JLabel label3 = new JLabel("CheckIn Time");
        label3.setBounds(30,180,250,20);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        label3.setForeground(Color.white);
        panel.add(label3);

        JLabel INTime = new JLabel();
        INTime.setBounds(200,180,250,20);
        INTime.setFont(new Font("Tahoma",Font.BOLD,14));
        INTime.setForeground(Color.white);
        panel.add(INTime);

        JLabel label4 = new JLabel("CheckOut Time");
        label4.setBounds(30,230,150,20);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        label4.setForeground(Color.white);
        panel.add(label4);

        Date date = new Date();

        JLabel OUTTime = new JLabel(""+date);
        OUTTime.setBounds(200,230,250,20);
        OUTTime.setFont(new Font("Tahoma",Font.BOLD,14));
        OUTTime.setForeground(Color.white);
        panel.add(OUTTime);

        JButton button = new JButton("DISCHARGE");
        button.setBounds(30,300,150,30);
        button.setFont(new Font("Tahoma",Font.BOLD,14));
        button.setForeground(Color.BLACK);
        button.setBackground(Color.white);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connection c = new connection();
                try {
                    c.statement.executeUpdate("delete from patient_info where Number = '" + choice.getSelectedItem() + "'");
                    c.statement.executeUpdate("update room set Availability = 'Available' where Room_no = '" + RNo.getText() + "'");
                    JOptionPane.showMessageDialog(null, "Discharge Successful");
                    setVisible(false);
                }catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });


        JButton button1 = new JButton("CHECK");
        button1.setBounds(185,300,150,30);
        button1.setFont(new Font("Tahoma",Font.BOLD,14));
        button1.setForeground(Color.BLACK);
        button1.setBackground(Color.white);
        panel.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                connection c = new connection();
                try {
                    ResultSet result = c.statement.executeQuery("select * from Patient_Info where number='"+choice.getSelectedItem()+"'");
                    while(result.next()){
                        RNo.setText(result.getString("Room_Number"));
                        INTime.setText(result.getString("Time"));
//                        OUTTime.setText(result.getString("CheckOut_Time"));
                    }
                }catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton button2 = new JButton("BACK");
        button2.setBounds(340,300,150,30);
        button2.setFont(new Font("Tahoma",Font.BOLD,14));
        button2.setForeground(Color.BLACK);
        button2.setBackground(Color.white);
        panel.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(800,400);
        setVisible(true);
        setLayout(null);
        setLocation(400,250);
    }

    public static void main(String[] args) {
        new patient_discharge();
    }
}
