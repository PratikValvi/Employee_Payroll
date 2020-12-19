import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeePayroll {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll");
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?useSSl=false";
        String userName = "root";
        String password = "root";
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!",e);
        }
        try {
            System.out.println("Connecting to Database: " + jdbcURL);
            con = DriverManager.getConnection(jdbcURL,userName,password);
            System.out.println("Connection is Successful !!!" + con);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
}
