import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.List;

public class EmployeePayrollServicesTest {

    @Test
    public void givenEmployeePayrollInDB_WhenRetrieved_ShouldMatchEmployeeCount() throws SQLException {
        EmployeePayrollService service = new EmployeePayrollService();
        List<EmployeePayrollData> employeePayrollData = service.readEmployeePayrollData(EmployeePayrollService.IOServices.DB_IO);
        Assertions.assertEquals(3,employeePayrollData.size());
    }
}
