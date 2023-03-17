public class Person {
    protected String name;
    protected String address;
    protected String phone_Number;
    protected String email_Address;
    public Person(){}
    public Person(String name, String address, String phone_Number, String email_Address) {
        this.name=name;
        this.address=address;
        this.phone_Number=phone_Number;
        this.email_Address=email_Address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + ' ' +
                ", address='" + address + ' ' +
                ", phoneNumber='" + phone_Number + ' ' +
                ", emailAddress='" + email_Address + ' ' +
                '}';
    }
}
