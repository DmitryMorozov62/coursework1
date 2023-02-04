public class Employee {
    String person;
    int department;
    int salary;
    static int id = 1;
    int idObject;

    public Employee(String person, int department, int salary) {
        this.person = person;
        this.department = department;
        this.salary = salary;
        idObject = id++;
    }
    public String getPerson() {
        return person;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public static int getId() {
        return id;
    }
    public int getIdObject() {
        return idObject;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  person + " отдел: " + department + ". зарплата " + salary + " рублей. номер:" + idObject;
    }
}
