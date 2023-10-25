package DataBaseOperetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Employee Id");
        int id=scanner.nextInt();
        System.out.println("Enter Emplyee Designation");
        String desg=scanner.next();
        Connection con;
        Statement stmt;
        String query="Update employee set emp_desg='"+desg+"'where emp_id="+id ;
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/1ejm10",
                    "root","");
            stmt=con.createStatement();
            int count=stmt.executeUpdate(query);
            if(count>0){
                System.out.println(count+"Recoprd Updated");
            }else{
                System.out.println("Record not updated");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
