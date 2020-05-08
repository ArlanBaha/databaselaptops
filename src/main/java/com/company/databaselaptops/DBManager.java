package com.company.databaselaptops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DBManager {
    private Connection connection;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/laptops?useUnicode=true&serverTimezone=UTC", "root", "thecharliebest123"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Laptop> take(Laptop laptop){
        ArrayList<Laptop> laptops=new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM laptops WHERE brand=? and segment=? and keyboard=? and os=?"
            );

            statement.setString(1, laptop.getBrand());
            statement.setString(2, laptop.getSegment());
            statement.setString(3, laptop.getKeyboard());
            statement.setString(4, laptop.getOs());

            ResultSet rs = statement.executeQuery();

                if (rs.next()) {
                    laptop.setId(rs.getInt("idlaptops"));
                    laptop.setBrand(rs.getString("brand"));
                    laptop.setSegment(rs.getString("segment"));
                    laptop.setKeyboard(rs.getString("keyboard"));
                    laptop.setOs(rs.getString("os"));
                    laptop.setPrice(rs.getString("price"));
                    laptops.add(laptop);
                    statement.close();
                    rs.close();

                }

        }
        catch (Exception et) {
            et.printStackTrace();
        }
        return laptops;
    }
}
