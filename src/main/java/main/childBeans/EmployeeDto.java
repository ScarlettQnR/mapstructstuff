package main.childBeans;

public class EmployeeDto {
    private int employeeId;
    private String employeeName;
    private DivisionDto division;
    // getters and setters omitted


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public DivisionDto getDivision() {
        return division;
    }

    public void setDivision(DivisionDto division) {
        this.division = division;
    }
}