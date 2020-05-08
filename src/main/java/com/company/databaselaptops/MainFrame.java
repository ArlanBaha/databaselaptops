package com.company.databaselaptops;

import javax.swing.*;
import java.sql.Connection;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private JLabel lb1;
    private JComboBox cmb1;
    private JLabel lb2;
    private JComboBox cmb2;
    private JLabel lb3;
    private JComboBox cmb3;
    private JLabel lb4;
    private JComboBox cmb4;


    public JComboBox getCmb1() {
        return cmb1;
    }

    private JButton btn;
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }
    public JComboBox getCmb2() {
        return cmb2;
    }
    public JComboBox getCmb3() {
        return cmb3;
    }
    public JComboBox getCmb4() {
        return cmb4;
    }

    public MainFrame() {

        DBManager manager = new DBManager();
        manager.connect();

        setTitle("STRIX");
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        lb1 = new JLabel("BRAND: ");
        lb1.setBounds(100, 70, 50, 30);
        add(lb1);

        String[] brands = {"Asus", "Lenovo", "Acer", "DELL"};
        cmb1 = new JComboBox(brands);
        cmb1.setBounds(150, 70, 100, 30);
        add(cmb1);
        String.valueOf(cmb1.getSelectedItem());


        lb2 = new JLabel("SEGMENT: ");
        lb2.setBounds(80, 110, 70, 30);
        add(lb2);

        String[] segment = {"Office", "Gaming"};
        cmb2 = new JComboBox(segment);
        cmb2.setBounds(150, 110, 100, 30);
        add(cmb2);

        lb3 = new JLabel("ILLUMINATION: ");
        lb3.setBounds(55, 150, 100, 30);
        add(lb3);
        String[] illu = {"YES", "NO"};

        cmb3 = new JComboBox(illu);
        cmb3.setBounds(150, 150, 100, 30);
        add(cmb3);

        String[] os = {"Windows", "Linux"};

        lb4 = new JLabel("OS: ");
        lb4.setBounds(123, 190, 100, 30);
        add(lb4);

        cmb4 = new JComboBox(os);
        cmb4.setBounds(150, 190, 100, 30);
        add(cmb4);

        btn = new JButton("FIND LAPTOP");
        btn.setBounds(260, 230, 120, 40);
        add(btn);

        btn.addActionListener(e -> {
            String brand = String.valueOf(cmb1.getSelectedItem());
            String segments = String.valueOf(cmb2.getSelectedItem());
            String illus = String.valueOf(cmb3.getSelectedItem());
            String oss = String.valueOf(cmb4.getSelectedItem());
            Laptop a = new Laptop(brand,segments,illus,oss);
            setVisible(false);
            MainFrame2 frame2 = new MainFrame2();
            frame2.setVisible(true);

            System.out.println(manager.take(a));


        });
    }


}