package person;

import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        Person person1 = new Person("Adam", "Kowalski", 43, 'M');
        Person person2 = new Person();

        //Utwórz nowy zbiór o elementach typu Person (możesz stworzyć np. zbiór typu HashSet). Wypełnij go 3 obiektami klasy Person.
        Set<Person> people = new HashSet<>();
        people.add(new Person("Anna", "Rataj", 32, 'K'));
        people.add(new Person("Tomasz", "Relig", 65, 'M'));
        people.add(new Person("Weronika", "Misol", 25, 'K'));



    }
}
