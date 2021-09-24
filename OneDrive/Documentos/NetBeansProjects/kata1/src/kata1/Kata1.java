package kata1;

import java.time.*;

public class Kata1 {

    public static void main(String[] args) {
        
        LocalDate date2 = LocalDate.of(1970, 9, 23);
        
        Person person = new Person("Blas", date2);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    } 
}