public class Employee {
    private String empName;
    private int age;
    private long salary;
    public Employee(String empName, int age, long salary) {
        super();
        this.empName = empName;
        this.age = age;
        this.salary = salary;
    }
    public String getEmpName() {
        return empName;
    }
    public int getAge() {
        return age;
    }
    public long getSalary() {
        return salary;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
