package EmpApp;

public interface EmployeeInterface {
    // Admin login
    public boolean login(String username, String password);

    // Create employee
    public void createEmployee(Employee emp);

    // Show all employees
    public void showAllEmployee();

    // Show employee based on ID
    public void showEmployeeBasedOnID(int id);

    // Update employee
    public void updateEmployee(int id, String name, double salary, int age, String phoneNumber, String gender, String mailId, String address, String department, String position, String dateOfJoining);

    // Delete employee
    public void deleteEmployee(int id);
}
