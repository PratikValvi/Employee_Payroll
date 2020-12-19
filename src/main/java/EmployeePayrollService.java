import java.sql.SQLException;
import java.util.List;

public class EmployeePayrollService {

    public enum IOServices {
        CONSOLE_IO, FILE_IO, DB_IO , REST_IO
    }

    private List<EmployeePayrollData> employeePayrollDataList;

    public List<EmployeePayrollData> readEmployeePayrollData(IOServices ioServices) throws SQLException {
        if (ioServices.equals(IOServices.DB_IO)) {
            this.employeePayrollDataList = new EmployeePayrollDBService().readData();
        }
        return employeePayrollDataList;
    }
}
