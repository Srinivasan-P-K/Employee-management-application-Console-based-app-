/*package EmpApp;

import java.util.Scanner;

public class Main {
    private static final String Admin_username="admin";
    private static final String Admin_password="password123";
    public static void main(String[] args) {

        String name, phoneNumber, gender, mailId, address;
        int id, age;
        double salary;
        //employee implement class object
        EmployeeImplement imp = new EmployeeImplement();

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello !!! Welcome to Employee Management Application");

        //admin login
        boolean loggedin=false;
        while (!loggedin){
            System.out.println("Admin Login");
            System.out.println("Enter Username : ");
            String username=sc.next();
            System.out.println("Enter Password : ");
            String password=sc.next();

            loggedin=imp.login(username,password);
        }
        do {
            System.out.println("1. Add Employee");
            System.out.println("2. Show All Employees");
            System.out.println("3. Show Employee Based on Id");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.println("Enter Choice:");
            String ch = sc.next();

            switch (ch) {
                case "1":
                    Employee emp = new Employee();
                    System.out.println("Enter Id:");
                    id = sc.nextInt();
                    System.out.println("Enter Name:");
                    name = sc.next();
                    System.out.println("Enter Salary:");
                    salary = sc.nextDouble();
                    System.out.println("Enter Age:");
                    age = sc.nextInt();
                    System.out.println("Enter Phone Number:");
                    phoneNumber = sc.next();
                    System.out.println("Enter Gender:");
                    gender = sc.next();
                    System.out.println("Enter Mail Id:");
                    mailId = sc.next();
                    System.out.println("Enter Address:");
                    address = sc.next();

                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    emp.setPhoneNumber(phoneNumber);
                    emp.setGender(gender);
                    emp.setMailId(mailId);
                    emp.setAddress(address);
                    System.out.println("--------------------");
                    imp.createEmployee(emp);
                    break;
                case "2":
                    imp.showAllEmployee();
                    break;
                case "3":
                    System.out.println("Enter Id to show the details:");
                    int empid = sc.nextInt();
                    imp.showEmployeeBasedOnID(empid);
                    break;
                case "4":
                    System.out.println("Enter Id to update the details:");
                    int empid1 = sc.nextInt();
                    System.out.println("Enter the new Name:");
                    name = sc.next();
                    imp.updateEmployee(empid1, name);
                    break;
                case "5":
                    System.out.println("Enter the Id to delete:");
                    id = sc.nextInt();
                    imp.deleteEmployee(id);
                    break;
                case "6":
                    System.out.println("Thank you for using our Application!!!!!!");
                    System.exit(0);
                default:
                    System.out.println("Enter Valid Choice!!!!!");
                    break;
            }
        } while (true);
    }
}
 */
package EmpApp;

import java.util.Scanner;

public class Main {
    public static String readGender(Scanner sc, String prompt) {
        String gender;
        while (true) {
            System.out.print(prompt);
            gender = sc.nextLine().toLowerCase();
            if (gender.equals("male") || gender.equals("female")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'male' or 'female'.");
            }
        }
        return gender;
    }
    public static void main(String[] args) {
        String name, phoneNumber, gender, mailId, address, department, position, dateOfJoining;
        int id, age;
        double salary;
        EmployeeImplement imp = new EmployeeImplement();

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello !!! Welcome to Employee Management Application");

        // Admin Login
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("Admin Login");
            System.out.print("Enter Username: ");
            String username = sc.next();
            System.out.print("Enter Password: ");
            String password = sc.next();

            loggedIn = imp.login(username, password);
        }

        do {
            System.out.println("1. Add Employee");
            System.out.println("2. Show All Employees");
            System.out.println("3. Show Employee Based on Id");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.println("Enter Choice:");
            String ch = sc.next();

            switch (ch) {
                case "1":
                    try{
                    Employee emp = new Employee();
                    System.out.println("Enter Id:");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name:");
                    name = sc.nextLine();
                    System.out.println("Enter Salary:");
                    salary = sc.nextDouble();
                    System.out.println("Enter Age:");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Phone Number:");
                    phoneNumber = sc.nextLine();
//                    System.out.println("Enter Gender:");
//                    gender = sc.nextLine();
                    gender = readGender(sc, "Enter Gender (male/female): ");
                    System.out.println("Enter Mail Id:");
                    mailId = sc.nextLine();
                    System.out.println("Enter Address:");
                    address = sc.nextLine();
                    System.out.println("Enter Department:");
                    department = sc.nextLine();
                    System.out.println("Enter Position:");
                    position = sc.nextLine();
                    System.out.println("Enter Date Of Joining (YYYY-MM-DD):");
                    dateOfJoining = sc.nextLine();

                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    emp.setPhoneNumber(phoneNumber);
                    emp.setGender(gender);
                    emp.setMailId(mailId);
                    emp.setAddress(address);
                    emp.setDepartment(department);
                    emp.setPosition(position);
                    emp.setDateOfJoining(dateOfJoining);

                    imp.createEmployee(emp);}
                    catch (Exception ex){
                        ex.printStackTrace();
                    }
                    break;
                case "2":
                    imp.showAllEmployee();
                    break;
                case "3":
                    System.out.println("Enter Id to show the details:");
                    int empid = sc.nextInt();
                    imp.showEmployeeBasedOnID(empid);
                    break;
                case "4":
                    System.out.println("Enter Id to update the details:");
                    int empid1 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the new Name:");
                    name = sc.nextLine();
                    System.out.println("Enter the new Salary:");
                    salary = sc.nextDouble();
                    System.out.println("Enter the new Age:");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the new Phone Number:");
                    phoneNumber = sc.nextLine();
//                    System.out.println("Enter the new Gender:");
//                    gender = sc.nextLine();
                    gender = readGender(sc, "Enter the new Gender (male/female): ");
                    System.out.println("Enter the new Mail Id:");
                    mailId = sc.nextLine();
                    System.out.println("Enter the new Address:");
                    address = sc.nextLine();
                    System.out.println("Enter the new Department:");
                    department = sc.nextLine();
                    System.out.println("Enter the new Position:");
                    position = sc.nextLine();
                    System.out.println("Enter the new Date Of Joining (YYYY-MM-DD):");
                    dateOfJoining = sc.nextLine();

                    imp.updateEmployee(empid1, name, salary, age, phoneNumber, gender, mailId, address, department, position, dateOfJoining);
                    break;
                case "5":
                    System.out.println("Enter the Id to delete:");
                    id = sc.nextInt();
                    imp.deleteEmployee(id);
                    break;
                case "6":
                    System.out.println("Thank you for using our Application!!!!!!");
                    System.exit(0);
                default:
                    System.out.println("Enter Valid Choice!!!!!");
                    break;
            }
        } while (true);
    }
}
