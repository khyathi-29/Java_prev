package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {


        System.out.println("Hello and welcome!");
        Connection connection = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5704093","sql5704093","a4leWxfsCY");
        Statement statement = connection.createStatement();
        statement.execute("create table person2 ( id int , name varchar(30));");


    }
}