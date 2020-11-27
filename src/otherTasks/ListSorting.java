package otherTasks;

import java.util.*;

public class ListSorting {

    public static void main(String[] args) {

        System.out.println(ascendingList(randomNumbersList()));
        System.out.println(descendingList(randomNumbersList()));
        System.out.println(sum(randomNumbersList()));
        System.out.println(sumOfFirstThree(randomNumbersList()));
        System.out.println(minus10(randomNumbersList()));
        System.out.println(multiplyBy2(randomNumbersList()));
        System.out.println(firstHalfOfList(randomNumbersList()));
        System.out.println(secondHalfOfList(randomNumbersList()));
        System.out.println(divideBy7(randomNumbersList()));
        System.out.println(squaredList(randomNumbersList()));


        /*
        System.out.println(secondSquare(list));
        System.out.println(indexOf22(list));
        System.out.println(valueOfIndex13(list));
        System.out.println(max(list));
        System.out.println(min(list));
        System.out.println(reverseOrder(list));
        System.out.println(swap(list));
        System.out.println(isEmpty(list));
        System.out.println(sizeOfList(list));
        System.out.println(iterator(list));

         */

    }

    public static List<Integer> randomNumbersList() {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 26; i++) {
            Random randomNumber = new Random();

            int number = randomNumber.nextInt(101);
            list.add(number);
        }
        return list;
    }

    public static List<Integer> ascendingList(List<Integer> list) {
        Collections.sort(list);
        return list;
    }

    public static List<Integer> descendingList(List<Integer> list){
        Collections.sort(list, Comparator.reverseOrder());
        //alternative: list.sort(Comparator.reverseOrder());
        return list;
    }


    public static int sum(List<Integer> list) {
        int sum = 0;

        for(int number : list){
            sum = sum + number;
        }

        return sum;
    }

    public static int sumOfFirstThree(List<Integer> list) {

        int sumOf3 = 0;

        for(int i = 0; i < 3; i++) {
            int number = list.get(i);
            sumOf3 = sumOf3 + number;
        }
        System.out.println("sumOfFirstThree: " + list);
        return sumOf3;
    }

    public static List<Integer> minus10(List<Integer> list) {
        System.out.println("List before adding: " + list);
        for(int i = 0; i < list.size(); i++){
            int number = list.get(i);
            number = number + 10;
            list.set(i, number);
        }

        return list;
    }

    public static List<Integer> multiplyBy2(List<Integer> list) {
        System.out.println("List before adding: " + list);
        for(int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            number = number * 2;
            list.set(i, number);
        }

        return list;
    }


    public static List<Integer> firstHalfOfList(List<Integer> list) {
        System.out.println("List before modification: " + list);
        return list.subList(0, list.size()/2);
    }

    public static List<Integer> secondHalfOfList(List<Integer> list) {
        System.out.println("List before modification: " + list);
        return list.subList(list.size()/2, list.size());
    }

    public static List<Integer> divideBy7(List<Integer> list) {
        System.out.println("List before modification: " + list);
        List<Integer> newList = new ArrayList<>();

        for(int number : list) {
            if (number % 7 == 0) {
                newList.add(number);
            }
        }
        return newList;
    }

    public static List<Integer> squaredList(List<Integer> list) {
        System.out.println("List before modification: " + list);
        List<Integer> newList = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            number = number * number;
            newList.add(i, number);
        }
        return newList;
    }

    public static List<Integer> secondSquare(List<Integer> list) {
        Collections.sort(list, Comparator.reverseOrder());
        return list;
    }

    public static List<Integer> indexOf22(List<Integer> list) {
        Collections.sort(list, Comparator.reverseOrder());
        return list;
    }

    public static List<Integer> valueOfIndex13(List<Integer> list) {
        Collections.sort(list, Comparator.reverseOrder());
        return list;
    }

    public static List<Integer> max(List<Integer> list) {
        Collections.sort(list, Comparator.reverseOrder());
        return list;
    }

    public static List<Integer> min(List<Integer> list) {
        Collections.sort(list, Comparator.reverseOrder());
        return list;
    }

    public static List<Integer> reverseOrder(List<Integer> list) {
        Collections.sort(list, Comparator.reverseOrder());
        return list;
    }

    public static List<Integer> swap(List<Integer> list) {
        Collections.sort(list, Comparator.reverseOrder());
        return list;
    }

    public static boolean isEmpty(List<Integer> list) {

        return false;
    }

    public static int sizeOfList(List<Integer> list) {
        return 0;
    }

    /*
    public static Iterator iterator(List<Integer> list) {

    }

     */
}
