package com.kavak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class DatabaseSelect {
    public static void main(String[] args) {

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:49161/XE","system", "oracle");
            Statement stmt = connect.createStatement();
            int takenNumber;
            Random random= new Random();
            long startTime = System.nanoTime();
            for(int i = 0; i < 100000; i++){
                ResultSet rs = stmt.executeQuery("SELECT VALUE2 FROM HR.HAZELCASTTABLE WHERE VALUE1 = "+i+"");
                rs.next();
                takenNumber = rs.getInt("VALUE2");
                
            }
            long elapsedTime = System.nanoTime() - startTime;
            double secondschange = (double)elapsedTime / 1000000000.0;
            System.out.println(secondschange);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}