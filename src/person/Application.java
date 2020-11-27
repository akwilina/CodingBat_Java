package person;

import java.util.*;

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
        people.add(new Person("Tomasz", "Witek", 74, 'M'));
        people.add(new Person("Natalia", "Relig", 43, 'K'));
        people.add(new Person("Tomasz", "Wolny", 33, 'M'));
        people.add(new Person("Waldek", "Witek", 78, 'M'));
        people.add(new Person("Natalia", "Migal", 66, 'K'));
        System.out.println(people.size());
        System.out.println(people.toString());

        System.out.println(uniqueNames(people));
        System.out.println(sortedUniqueNames(people));
        System.out.println(firstLastName(people));

    }

    //- metodę, która na podstawie zbioru osób zwróci zbiór unikalnych imion tych osób,
    public static Set<String> uniqueNames(Set<Person> people) {
        Set<String> uniqueNames = new HashSet<>();

        for(Person person : people) {
            String name = person.getFirstName();
            uniqueNames.add(name);
        }
        return uniqueNames;
    }

    //   - metodę, która na podstawie zbioru osób zwróci zbiór unikalnych imion tych osób, posortowany,
    public static Set<String> sortedUniqueNames(Set<Person> people) {
        Set<String> uniqueNames = new TreeSet<>();

        for(Person person : people) {
            String name = person.getFirstName();
            uniqueNames.add(name);
        }
        return uniqueNames;
    }

    //   - metodę, która na podstawie zbioru osób zwróci listę zawierającą połączenie imienia i nazwiska każdej z osób (np. "Jan Kowalski"),
    public static List<String> firstLastName (Set<Person> people) {

        List<String> names = new ArrayList<>();

        for(Person person : people) {
            String firstName = person.getFirstName();
            String lastName = person.getLastName();
            String name = firstName + " " + lastName;
            names.add(name);
        }

        return names;
    }


    //   - metodę, która na podstawie zbioru osób zwróci sumę wieku wszystkich osób,
    //   - metodę, która na podstawie zbioru osób zwróci mapę, w której kluczem będzie płeć, a wartością ilość osób o takiej płci (mapa typu Map<Character, Integer)
    //   - metodę, która na podstawie zbioru osób zwróci mapę, w której kluczem będzie wiek osoby, a wartością lista osób o tym wieku (mapa typu Map<Integer, List<Person>>)
}
