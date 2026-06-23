package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class department extends JFrame {
    department(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        panel.setBackground(new Color(1,55,85));
        add(panel);

        JTable table=new JTable();
        table.setBounds(0,40,900,350);
        table.setBackground(new Color(1,55,85));
        table.setForeground(Color.white);
        table.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(table);

        try{
            connection con=new connection();
            String q="select * from department";
            ResultSet rs=con.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel lable1=new JLabel("Department");
        lable1.setBounds(5,10,105,20);
        lable1.setFont(new Font("Tahoma",Font.BOLD,16));
        lable1.setForeground(Color.white);
        panel.add(lable1);

        JLabel lable2=new JLabel("Phone Number");
        lable2.setBounds(450,10,300,20);
        lable2.setFont(new Font("Tahoma",Font.BOLD,16));
        lable2.setForeground(Color.white);
        panel.add(lable2);

        JButton button1=new JButton("Back");
        button1.setBackground(Color.white);
        button1.setForeground(Color.BLACK);
        button1.setFont(new Font("Tahoma",Font.BOLD,16));
        button1.setBounds(300,400,100,30);
        panel.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(700,500);
        setLayout(null);
        setLocation(350,250);
        setVisible(true);
    }
    public static void main() {
        new department();

    }
}
