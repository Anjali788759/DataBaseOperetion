package DataBaseOperetion;




import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DisplayData {
    public static void main(String[] args) {
        try {
     Statement statement = DriverManager.getConnection("jdbc:mysql://localhost:" +
             "3306/1ejm10","root","").createStatement();
            ResultSet rs= statement.executeQuery("select * from employee");
            System.out.println("EMPID EMPNAME EMPSAL EMPDESG");
            while (rs.next()){
                System.out.println(rs.getInt(1)+""+rs.getString(2)+""
                        +rs.getDouble(3)+""+rs.getString(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
