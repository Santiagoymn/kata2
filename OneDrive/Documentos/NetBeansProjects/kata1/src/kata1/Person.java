package kata1;


import java.time.*;


public class Person {
    private final String name;
    private final LocalDate birthday;


public Person(String name, LocalDate birthday){
    this.name = name;
    this.birthday = birthday;
}

public String getName(){
    return name;
}

public LocalDate getBirthday(){
    return birthday;
}

public int getAge(){
    LocalDate hoy = LocalDate.now();
    return Period.between(getBirthday(), hoy).getYears();
}



}