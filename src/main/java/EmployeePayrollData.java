import java.time.LocalDate;

public class EmployeePayrollData {
    int id;
    String name;
    double salary;
    LocalDate localDate;

    public EmployeePayrollData(int id, String name, double salary, LocalDate localDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.localDate = localDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        String details = "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Salary: " + salary + "\n" +
                "Start: " + localDate + "\n";
        return details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeePayrollData)) return false;
        EmployeePayrollData that = (EmployeePayrollData) o;
        return getId() == that.getId() && Double.compare(that.getSalary(), getSalary()) == 0 && getName().equals(that.getName()) && getLocalDate().equals(that.getLocalDate());
    }
}
