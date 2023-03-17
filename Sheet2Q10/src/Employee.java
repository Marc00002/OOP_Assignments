public class Employee extends Person {
    protected String office;
    protected double salary;
    protected String date_Hired;
    public Employee(){}
    public Employee(String name, String address, String phone_Number, String email_Address, String office, double salary, String date_Hired) {
        super(name, address, phone_Number, email_Address);
        this.office = office;
        this.salary=salary;
        this.date_Hired=date_Hired;
    }
    public String toString() {
        return super.toString() + "  Office: " + office +
                "  Salary: " + salary + " $" + "  Date hired: " + date_Hired;
    }
}
