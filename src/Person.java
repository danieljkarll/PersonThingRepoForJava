public class Person {

    private String firstName;
    private String lastName;
    private int age;
    //private static Boolean isCool = true;

    public Person(String fname, String lname,int ages){
        firstName= fname;
        lastName= lname;
        age = ages;
    }
    public Person(String fname, String lname){
        firstName= fname;
        lastName= lname;
        age= -1;
    }
    public Person(String fname){
        firstName= fname;
        lastName= null;
        age = -1;
    }

    public String firstNameReturn(){
        return firstName;
    }
    public String lastNameReturn(){
        return lastName;
    }
    public int age(){
        return age;
    }
}
