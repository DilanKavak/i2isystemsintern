package com.kavak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class DatabaseSelect {
    public static void main(String[] args) {

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:49161/XE","system", "oracle");
            Statement stmt = connect.createStatement();
            long startTime = System.nanoTime();
            for(int i = 0; i < 100000; i++){
                ResultSet resultSet = stmt.executeQuery("SELECT VALUE2 FROM HR.HAZELCASTTABLE WHERE VALUE1 = "+i+"");
                resultSet.next();
                int takenNumber = resultSet.getInt("VALUE2");
                
            }
            long elapsedTime = System.nanoTime() - startTime;
            double secondsChange = (double)elapsedTime / 1000000000.0;
            System.out.println(secondsChange);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}