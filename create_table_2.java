package sample;

import java.sql.Connection;
import java.sql.Statement;

public class create_table_2 {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        check_table_1 obj=new check_table_1();
        connection = obj.get_connection();

        try{
            String query = "create table student(s_no SERIAL primary key, s_name varchar(100), s_address varchar(900), s_course varchar(100), s_ageno int, s_contact bigint)";
            statement= connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Finish the Update");
        }
        catch (Exception e){
            System.out.println("\n"+e);
        }
    }
}
