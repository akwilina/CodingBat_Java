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

        //Stwórz nowy obiekt klasy Person o takim samym imieniu i nazwisku, co któryś z obiektów z pkt 3.
        Person person3 = new Person("Anna", "Rataj", 44, 'K');

        //W interfejsie Set są metody: contains oraz remove, które umożliwiają sprawdzenie czy w zbiorze jest dany obiekt
        // i usunięcie obiektu ze zbioru. Wykorzystaj te metody, aby ze zbioru z pkt. 3. usunąć obiekt z pkt. 4. Jak to osiągnąć?

        System.out.println(people.size());
        people.remove(person3);
        System.out.println(people.size());

        //Dodaj do zbioru z pkt. 3 dwa nowe obiekty klasy Person o takich samych imionach, ale różnych pozostałych danych.
        System.out.println(people.toString());
        people.add(new Person("Anna", "Rataj", 67, 'M'));
        people.add(new Person("Tomasz", "Relig", 14, 'K'));
        System.out.println(people.size());
        System.out.println(people.toString());



    }
}
