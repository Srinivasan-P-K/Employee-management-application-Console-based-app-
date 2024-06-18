/*package EmpApp;

import java.sql.*;

public class EmployeeImplement implements EmployeeInterface {
    Connection con;

    public boolean login(String username,String password){
        try{
            con=DBConnection.createDBConnection();
            String query="select * from admin where username=? and password=?";
            PreparedStatement st= con.prepareStatement(query);
            st.setString(1,username);
            st.setString(2,password);
            ResultSet rs=st.executeQuery();

            if(rs.next()){
                return true;
            }else {
                System.out.println("Invalid Username or Password");
                return false;
            }

        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public void createEmployee(Employee emp) {
        try {
            con = DBConnection.createDBConnection();
            String query = "INSERT INTO employee (id, name, salary, age, phoneNumber, gender, mailId, address) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, emp.getId());
            pst.setString(2, emp.getName());
            pst.setDouble(3, emp.getSalary());
            pst.setInt(4, emp.getAge());
            pst.setString(5, emp.getPhoneNumber());
            pst.setString(6, emp.getGender());
            pst.setString(7, emp.getMailId());
            pst.setString(8, emp.getAddress());

            int row = pst.executeUpdate();
            if (row != 0) {
                System.out.println("Employee Inserted Successfully");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void showAllEmployee() {
        try {
            con = DBConnection.createDBConnection();
            String query = "SELECT * FROM employee";
            System.out.println("Employee Details");
            System.out.println("---------------------------");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println("Employee Id: " + rs.getInt(1));
                System.out.println("Employee Name: " + rs.getString(2));
                System.out.println("Salary: " + rs.getDouble(3));
                System.out.println("Age: " + rs.getInt(4));
                System.out.println("Phone Number: " + rs.getString(5));
                System.out.println("Gender: " + rs.getString(6));
                System.out.println("Mail Id: " + rs.getString(7));
                System.out.println("Address: " + rs.getString(8));
                System.out.println("---------------------------");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void showEmployeeBasedOnID(int id) {
        try {
            con = DBConnection.createDBConnection();
            String query = "SELECT * FROM employee WHERE id = " + id;

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println("Employee Id: " + rs.getInt(1));
                System.out.println("Employee Name: " + rs.getString(2));
                System.out.println("Salary: " + rs.getDouble(3));
                System.out.println("Age: " + rs.getInt(4));
                System.out.println("Phone Number: " + rs.getString(5));
                System.out.println("Gender: " + rs.getString(6));
                System.out.println("Mail Id: " + rs.getString(7));
                System.out.println("Address: " + rs.getString(8));
                System.out.println("---------------------------");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(int id, String name) {
        try {
            con = DBConnection.createDBConnection();
            String query = "UPDATE employee SET name = ? WHERE id = ?";

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setInt(2, id);
            int row = pst.executeUpdate();
            if (row != 0) {
                System.out.println("Employee Details Updated Successfully");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
        try {
            con = DBConnection.createDBConnection();
            String query = "DELETE FROM employee WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            int row = pst.executeUpdate();
            if (row != 0) {
                System.out.println("Employee Deleted Successfully");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
*/
package EmpApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeImplement implements EmployeeInterface {
    Connection con;

    public boolean login(String username, String password) {
        try {
            con = DBConnection.createDBConnection();
            String query = "SELECT * FROM admin WHERE username = ? AND password = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                System.out.println("Invalid Username or Password");
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public void createEmployee(Employee emp) {
        try {
            con = DBConnection.createDBConnection();
            String query = "INSERT INTO employee1 (id, name, salary, age, phoneNumber, gender, mailId, address, department, position, dateOfJoining) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, emp.getId());
            pst.setString(2, emp.getName());
            pst.setDouble(3, emp.getSalary());
            pst.setInt(4, emp.getAge());
            pst.setString(5, emp.getPhoneNumber());
            pst.setString(6, emp.getGender());
            pst.setString(7, emp.getMailId());
            pst.setString(8, emp.getAddress());
            pst.setString(9, emp.getDepartment());
            pst.setString(10, emp.getPosition());
            pst.setString(11, emp.getDateOfJoining());

            int row = pst.executeUpdate();
            if (row != 0) {
                System.out.println("Employee Inserted Successfully");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void showAllEmployee() {
        try {
            con = DBConnection.createDBConnection();
            String query = "SELECT * FROM employee1";
            System.out.println("Employee Details");
            System.out.println("---------------------------");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println("Employee Id: " + rs.getInt(1));
                System.out.println("Employee Name: " + rs.getString(2));
                System.out.println("Salary: " + rs.getDouble(3));
                System.out.println("Age: " + rs.getInt(4));
                System.out.println("Phone Number: " + rs.getString(5));
                System.out.println("Gender: " + rs.getString(6));
                System.out.println("Mail Id: " + rs.getString(7));
                System.out.println("Address: " + rs.getString(8));
                System.out.println("Department: " + rs.getString(9));
                System.out.println("Position: " + rs.getString(10));
                System.out.println("Date Of Joining: " + rs.getString(11));
                System.out.println("---------------------------");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void showEmployeeBasedOnID(int id) {
        try {
            con = DBConnection.createDBConnection();
            String query = "SELECT * FROM employee1 WHERE id = " + id;

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println("Employee Id: " + rs.getInt(1));
                System.out.println("Employee Name: " + rs.getString(2));
                System.out.println("Salary: " + rs.getDouble(3));
                System.out.println("Age: " + rs.getInt(4));
                System.out.println("Phone Number: " + rs.getString(5));
                System.out.println("Gender: " + rs.getString(6));
                System.out.println("Mail Id: " + rs.getString(7));
                System.out.println("Address: " + rs.getString(8));
                System.out.println("Department: " + rs.getString(9));
                System.out.println("Position: " + rs.getString(10));
                System.out.println("Date Of Joining: " + rs.getString(11));
                System.out.println("---------------------------");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(int id, String name, double salary, int age, String phoneNumber, String gender, String mailId, String address, String department, String position, String dateOfJoining) {
        try {
            con = DBConnection.createDBConnection();
            String query = "UPDATE employee1 SET name = ?, salary = ?, age = ?, phoneNumber = ?, gender = ?, mailId = ?, address = ?, department = ?, position = ?, dateOfJoining = ? WHERE id = ?";

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setDouble(2, salary);
            pst.setInt(3, age);
            pst.setString(4, phoneNumber);
            pst.setString(5, gender);
            pst.setString(6, mailId);
            pst.setString(7, address);
            pst.setString(8, department);
            pst.setString(9, position);
            pst.setString(10, dateOfJoining);
            pst.setInt(11, id);
            int row = pst.executeUpdate();
            if (row != 0) {
                System.out.println("Employee Details Updated Successfully");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
        try {
            con = DBConnection.createDBConnection();
            String query = "DELETE FROM employee1 WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            int row = pst.executeUpdate();
            if (row != 0) {
                System.out.println("Employee Deleted Successfully");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
