package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class all_patient_info extends JFrame {
    all_patient_info(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(1,55,85));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,40,900,450);
        table.setBackground(new Color(1,55,85));
        table.setFont(new Font("Tahoma",Font.PLAIN,14));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            connection con=new connection();
            String sql="select * from Patient_Info";
            ResultSet rs=con.statement.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel label = new JLabel("ID");
        label.setBounds(10,11,100,30);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(label);

        JLabel label1 = new JLabel("Number");
        label1.setBounds(120,11,100,30);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(label1);

        JLabel label2 = new JLabel("Name");
        label2.setBounds(230,11,100,30);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(label2);

        JLabel label3 = new JLabel("Gender");
        label3.setBounds(350,11,100,30);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(label3);

        JLabel label4 = new JLabel("Patient Disease");
        label4.setBounds(460,11,100,30);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(label4);

        JLabel label5 = new JLabel("Room Number");
        label5.setBounds(570,11,100,30);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(label5);

        JLabel label6 = new JLabel("Time");
        label6.setBounds(685,11,100,30);
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(label6);

        JLabel label7 = new JLabel("Deposit");
        label7.setBounds(800,11,100,30);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(label7);

        JButton btn1 = new JButton("BACK");
        btn1.setBackground(Color.WHITE);
        btn1.setBounds(350,500,200,30);
        btn1.setFont(new Font("Tahoma",Font.PLAIN,14));
        btn1.setForeground(Color.BLACK);
        panel.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });



        setUndecorated(true);
        setSize(1000,600);
        setLayout(null);
        setLocation(430,250);
        setVisible(true);

    }

    public static void main() {
        new all_patient_info();

    }
}
