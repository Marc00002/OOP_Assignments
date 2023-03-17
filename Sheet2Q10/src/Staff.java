public class Staff extends Employee{
    private String title;
    public Staff(){}
    public Staff(String name,String address,String phone_Number,String email_Address,String office, double salary, String date_Hired,String title){
        super(name, address, phone_Number, email_Address,office, salary, date_Hired);
        this.title=title;
    }
    public String toString() {
        return super.toString() + "  Title: " + title;
    }

}
