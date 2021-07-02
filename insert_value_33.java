package sample;

import java.sql.Connection;
import java.sql.Statement;

public class insert_value_33 {

   public void insert(String name,String address,String course,int ageno,long contact){

       Connection connection = null;
       Statement statement = null;
       check_table_1 obj=new check_table_1();
       connection = obj.get_connection();

       String s_name= name;
       String s_address= address;
       String s_course= course;
       int s_ageno= ageno;
       long s_contact= contact;
       try{
           String query = "insert into student (s_name,s_address,s_course,s_ageno,s_contact) values('"+s_name+"','"+s_address+"','"+s_course+"','"+s_ageno+"','"+s_contact+"')";
           statement= connection.createStatement();
           statement.executeUpdate(query);
           System.out.println("Finish the Update");
       }
       catch (Exception e){
           System.out.println("check 2");
           System.out.println("\n"+e);
       }

   }
}
