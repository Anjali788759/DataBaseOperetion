package DataBaseOperetion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {

      String url="jdbc:mysql://localhost:3306/1ejm10";
      String user="root";
      String password="";
        try {
            Connection con= DriverManager.getConnection(url,user,password);
            Statement stmt=con.createStatement();
            String sql="insert into employee"+"(emp_id,emp_name,emp_sal,emp_desg)"+
                    "values(10,'Amit Hedau',3788.00,'Developer')";
            stmt.executeUpdate(sql);
            System.out.println("Insert Complete");
            con.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
