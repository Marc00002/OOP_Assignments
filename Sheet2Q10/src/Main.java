public class Main {
    public static void main(String[] args)
    {
        Person x=new Person("mohamed","Smouha","01225889794","hooo@gmail.com");
        Student y=new Student("ossama","ibrahimia","01278979847","oss@gmail.com","Freshman");
        Employee z=new Employee("Hassan","maamoura","01054447879","Hassan@yahoo.com","402",15000,"15/10/2000");
        Faculty a=new Faculty("Hossam","Cleopatra","01015889724","Hoss@gmail.com","702",20000,"04/12/2005","from 1 to 5","Assistant");
        Staff b=new Staff("Mona","San Stefano","01228778646","Mona@gmail.com","800",9000,"02/04/2009","Helper");

        System.out.println(x.toString());
        System.out.println(y.toString());
        System.out.println(z.toString());
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}