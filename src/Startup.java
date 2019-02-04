public class Startup {

    public static void main(String[] args){
        Person[] peepsArray = {new Person ("John", "Connor", 88), new Person ("Bob", "Builder"), new Person ("Jeff")};

        for(int i=0; i<peepsArray.length; i++){
            System.out.println("First Name: " + peepsArray[i].firstNameReturn() +"Last Name: "+ peepsArray[i].lastNameReturn() +"Age: " + peepsArray[i].age());
        }
   }
}
