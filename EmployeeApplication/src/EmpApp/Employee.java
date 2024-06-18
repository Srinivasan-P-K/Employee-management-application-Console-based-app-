/*package EmpApp;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private int age;
    private String phoneNumber;
    private String gender;
    private String mailId;
    private String address;

    public Employee() {
    }

    public Employee(int id, String name, double salary, int age, String phoneNumber, String gender, String mailId, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.mailId = mailId;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", mailId='" + mailId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
*/
package EmpApp;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private int age;
    private String phoneNumber;
    private String gender;
    private String mailId;
    private String address;
    private String department;
    private String position;
    private String dateOfJoining;

    public Employee() {
    }

    public Employee(int id, String name, double salary, int age, String phoneNumber, String gender, String mailId, String address, String department, String position, String dateOfJoining) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.mailId = mailId;
        this.address = address;
        this.department = department;
        this.position = position;
        this.dateOfJoining = dateOfJoining;
    }

    // Getters and Setters for all attributes
    // ... (include getters and setters for new attributes as well)

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", mailId='" + mailId + '\'' +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                '}';
    }
}
