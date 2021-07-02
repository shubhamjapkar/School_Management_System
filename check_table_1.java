package sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class check_table_1 {
    public static void main(String[] args) {
        check_table_1 obj=new check_table_1();
        System.out.println(obj.get_connection());
    }



    public Connection get_connection () {
        Connection connection = null;
        String host="localhost";
        String port="5432";
        String db_name="postgres";
        String username="postgres";
        String password="Shubham@2001";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+db_name+"", ""+username+"", ""+password+"");
            if (connection != null) {
                System.out.println("Connection OK");
            } else {
                System.out.println("Connection Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}