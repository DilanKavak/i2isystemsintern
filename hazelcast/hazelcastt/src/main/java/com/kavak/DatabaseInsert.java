package com.kavak;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

public class DatabaseInsert {

    public static void main(String[] args) {

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:49161/XE","system", "oracle");
            Statement stmt = connect.createStatement();

            Random random= new Random();
            long startTime = System.nanoTime();
            for(int i = 0; i < 20000; i++){
                stmt.executeUpdate("INSERT INTO HR.HAZELCASTTABLE VALUES("+i+","+random.nextInt(5000)+")");
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