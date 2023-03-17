public class Student extends Person{
    private final String class_status ;
    public Student(){
        class_status=null;
    }
    public Student(String name, String address, String phone_Number, String email_Address, String class_status) {
        super(name, address, phone_Number, email_Address);
        this.class_status = class_status;
    }
    @Override
    public String toString() {
        return super.toString() + "  Status: " + class_status;
    }
}
