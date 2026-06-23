package hospital.management.system;
import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class employee_info extends JFrame {
    employee_info(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(1,55,85));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,40,980,300);
        table.setBackground(new Color(1,55,85));
        table.setForeground(Color.WHITE);
        table.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(table);

        try{
            connection conn = new connection();
            String query = "select * from EMP_INFO";
            ResultSet resultSet = conn.statement.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel label1 = new JLabel("Name");
        label1.setFont(new Font("Tahoma",Font.BOLD,16));
        label1.setForeground(Color.WHITE);
        label1.setBounds(12,10,70,20);
        panel.add(label1);

        JLabel label2 = new JLabel("Age");
        label2.setFont(new Font("Tahoma",Font.BOLD,16));
        label2.setForeground(Color.WHITE);
        label2.setBounds(175,10,70,20);
        panel.add(label2);

        JLabel label3 = new JLabel("Phone Number");
        label3.setFont(new Font("Tahoma",Font.BOLD,16));
        label3.setForeground(Color.WHITE);
        label3.setBounds(335,10,200,20);
        panel.add(label3);

        JLabel label4 = new JLabel("Salary");
        label4.setFont(new Font("Tahoma",Font.BOLD,16));
        label4.setForeground(Color.WHITE);
        label4.setBounds(500,10,70,20);
        panel.add(label4);

        JLabel label5 = new JLabel("Gmail ID");
        label5.setFont(new Font("Tahoma",Font.BOLD,16));
        label5.setForeground(Color.WHITE);
        label5.setBounds(660,10,110,20);
        panel.add(label5);

        JLabel label6 = new JLabel("Aadhar Number");
        label6.setFont(new Font("Tahoma",Font.BOLD,16));
        label6.setForeground(Color.WHITE);
        label6.setBounds(825,10,200,20);
        panel.add(label6);

        JButton button = new JButton("BACK");
        button.setFont(new Font("Tahoma",Font.BOLD,16));
        button.setBounds(440,400,100,30);
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });


        setUndecorated(true);
        setSize(1000,590);
        setVisible(true);
        setLocation(350,250);
        setLayout(null);
    }
    public static void main() {
        new employee_info();
    }
}
