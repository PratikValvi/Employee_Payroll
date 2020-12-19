import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollDBService {

    private Connection getConnection() throws SQLException {
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?useSSl=false";
        String userName = "root";
        String password = "root";
        Connection con;
        System.out.println("Connecting to Database: " + jdbcURL);
        con = DriverManager.getConnection(jdbcURL,userName,password);
        System.out.println("Connection is Successful !!!" + con);
        return con;
    }

    public List<EmployeePayrollData> readData() {
        String sql = "SELECT * FROM employee_payroll;";
        List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
        try {
            Connection con = this.getConnection();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getNString("name");
                double salary = resultSet.getDouble("salary");
                LocalDate startDate = resultSet.getDate("start").toLocalDate();
                employeePayrollDataList.add(new EmployeePayrollData(id,name,salary,startDate));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return employeePayrollDataList;
    }
}
