package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class update_patient_details extends JFrame {

    update_patient_details(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,940,490);
        panel.setBackground(new Color(1,55,85));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/updated.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        label.setBounds(500,60,300,300);
        panel.add(label);

        JLabel label1 = new JLabel("Update Patient Details");
        label1.setBounds(124,11,222,25);
        label1.setFont(new Font("Tahoma",Font.BOLD,16));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2 = new JLabel("Name :");
        label2.setBounds(25,88,100,14);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        Choice choice = new Choice();
        choice.setBounds(248,85,140,25);
        panel.add(choice);

        try{
            connection con = new connection();
            ResultSet resultSet = con.statement.executeQuery("select * from Patient_Info");
            while(resultSet.next()){
                choice.add(resultSet.getString("Name"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel label3 = new JLabel("Room Number :");
        label3.setBounds(25,129,150,14);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JTextField fieldR = new JTextField();
        fieldR.setBounds(248,129,140,25);
        panel.add(fieldR);

        JLabel label4 = new JLabel("In-Time :");
        label4.setBounds(25,174,100,20);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        JTextField fieldI = new JTextField();
        fieldI.setBounds(248,174,140,25);
        panel.add(fieldI);

        JLabel label5 = new JLabel("Amount Paid :");
        label5.setBounds(25,216,100,20);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        JTextField fieldD = new JTextField();
        fieldD.setBounds(248,216,140,25);
        panel.add(fieldD);

        JLabel label6 = new JLabel("Pending");
        label6.setBounds(25,261,100,25);
        label6.setFont(new Font("Tahoma",Font.BOLD,14));
        label6.setForeground(Color.WHITE);
        panel.add(label6);

        JTextField fieldP = new JTextField();
        fieldP.setBounds(248,261,140,25);
        panel.add(fieldP);

        JButton button = new JButton("CHECK");
        button.setBounds(281,378,89,23);
        button.setBackground(Color.WHITE);
        button.setFont(new Font("Tahoma",Font.BOLD,14));
        button.setForeground(Color.BLACK);
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String patientName = choice.getSelectedItem();
                String q = "select * from patient_info where Name = '" + patientName + "'";

                try {
                    connection con = new connection();
                    // 1. Fetch Patient Info
                    ResultSet rs1 = con.statement.executeQuery(q);
                    if (rs1.next()) {
                        fieldR.setText(rs1.getString("Room_Number"));
                        fieldI.setText(rs1.getString("Time"));
                        fieldD.setText(rs1.getString("Deosit")); // Ensure this is not empty
                    }

                    // 2. Fetch Room Price based on retrieved Room Number
                    String roomNum = fieldR.getText();
                    ResultSet rs2 = con.statement.executeQuery("select * from Room where Room_no = '" + roomNum + "'");

                    if (rs2.next()) {
                        String priceStr = rs2.getString("Price");
                        String depositStr = fieldD.getText();

                        // Validation: Only calculate if we have values to avoid NumberFormatException
                        if (!priceStr.isEmpty() && !depositStr.isEmpty()) {
                            int price = Integer.parseInt(priceStr);
                            int deposit = Integer.parseInt(depositStr);
                            int pending = price - deposit;
                            fieldP.setText(String.valueOf(pending));
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error calculating pending amount. Check database values.");
                }
            }
        });

        JButton button2 = new JButton("UPDATE");
        button2.setBounds(56,378,89,23);
        button2.setBackground(Color.WHITE);
        button2.setFont(new Font("Tahoma",Font.BOLD,14));
        button2.setForeground(Color.BLACK);
        panel.add(button2);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    connection con = new connection();
                    String q = choice.getSelectedItem();
                    String roomNo = fieldR.getText();
                    String time = fieldI.getText();
                    String deposit = fieldD.getText();
                    con.statement.executeUpdate("update Patient_Info set Room_Number = '"+room+"',Time = '"+time+"',Deposit = '"+deposit+"' where name = );
                }catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        });



        setSize(950,500);
        setLayout(null);
        setVisible(true);
        setLocation(400,250);
    }

    public static void main(String[] args) {
        new update_patient_details();
    }
}
