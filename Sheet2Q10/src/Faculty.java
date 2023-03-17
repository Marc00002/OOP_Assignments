public class Faculty extends Employee{
    private String office_Hours;
    private String rank;
    public Faculty(){}
    public Faculty(String name,String address,String phone_Number,String email_Address,String office, double salary, String date_Hired,String office_Hours,String rank ){
        super(name, address, phone_Number, email_Address,office, salary, date_Hired);
        this.office_Hours=office_Hours;
        this.rank=rank;
    }
    public String toString() {
        return super.toString() + "  Office hours: " + office_Hours +
                "  Rank: " + rank;
    }
}
