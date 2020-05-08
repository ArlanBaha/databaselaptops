package com.company.databaselaptops;

import javax.swing.*;

public class MainFrame2 extends JFrame {
    private JButton btnBuy;

    public MainFrame2() {
        setTitle("ORDER");
        setSize(550, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        final JList list = new JList();

        btnBuy = new JButton("BUY!");
        btnBuy.setBounds(230,460,70,40);
        add(btnBuy);
    }
}
