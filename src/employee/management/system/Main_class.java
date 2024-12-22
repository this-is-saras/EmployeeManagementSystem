package employee.management.system;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame{

    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120,630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1120,630);
        add(image);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(340, 155, 488, 48);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        image.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(335, 270, 150, 40);
        add.setForeground(Color.white);
        add.setBackground(Color.black);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                setVisible(false);
            }
        });
        image.add(add);

        setSize(1120,630);
        JButton view = new JButton("View Employee");
        view.setBounds(565, 270, 150, 40);
        view.setForeground(Color.white);
        view.setBackground(Color.black);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewEmployee();
                setVisible(false);
            }
        });
        image.add(view);

        // setSize(1120,630);
        JButton rem = new JButton("Remove Employee");
        rem.setBounds(440, 370, 150, 40);
        rem.setForeground(Color.white);
        rem.setBackground(Color.black);
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();
            }
        });
        image.add(rem);

        setSize(1120,630);
        setVisible(true);
        setLayout(null);
        setLocation(230,100);
    }

    public static void main(String[] args) {
        new Main_class();
    }
}
