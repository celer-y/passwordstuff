package com.mycompany.test1;

import java.sql.*;

public class getFromDataBase {
    public static void main(String[] args){
    	
        try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpass","root","root");
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from info");

        while(resultSet.next()){
            System.out.println(resultSet.getString("UserName"));
        }

        } catch (Exception e){
            e.printStackTrace();;
        }
        
    }
           
}