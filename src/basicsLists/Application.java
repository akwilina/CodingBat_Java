package basicsLists;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(1, 2, 3, -4, 4, 3, -1, 2, 7, 8, 99, -13, 0, 0, 1, 0, 3, 3, -8, -1, 1, 6));
        System.out.println(max(list));
        System.out.println(min(list));
        System.out.println(sum(list));
        System.out.println(average(list));
        System.out.println(multiplyEven(list));
        System.out.println(listContainsNumber(list, 8));
        System.out.println(listContainsNumber(list, 9));
        System.out.println(numberPositionOnList(list, 7));
        System.out.println(evenNumbersList(list));
        System.out.println(sortedList(list));
        System.out.println(occurrenceCounter(list));
        System.out.println(maxValueOfSortedList(list));
        System.out.println(minValueOfSortedList(list));


    }


    public static int max(List<Integer> list) {
        int max = Integer.MIN_VALUE;

        if(list.isEmpty()) {
            return 0;
        }

        for (Integer number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int min(List<Integer> list) {
        int min = Integer.MAX_VALUE;

        for (Integer number : list) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }


    public static int sum(List<Integer> list) {
        int sum = 0;

        for (Integer number : list) {
            sum = sum + number;
        }
        return sum;
    }

    public static int average(List<Integer> list) {
        int average;
        int sum = 0;

        for (Integer number : list) {

            sum = sum + number;
        }
        average = sum / list.size();

        return average;
    }

    public static int multiplyEven(List<Integer> list) {
        int evenMultiply = 1;

        for (Integer number : list) {
            if (number % 2 == 0) {
                evenMultiply *= number;
            }
        }
        return evenMultiply;
    }

    public static boolean listContainsNumber(List<Integer> list, int number) {
        boolean result = false;

        for (Integer listNumber : list) {
            if (listNumber == number) {
                result = true;
                break;
            }
        }

        return result;
    }

    public static int numberPositionOnList(List<Integer> list, int number){
        int position = 0;

        for(int i = 0; i < list.size(); i++) {

            if(list.get(i) == number) {
                position = i;
                break;
            }
        }
        return position;
    }

    public static List<Integer> evenNumbersList(List<Integer> list) {
        List<Integer> evenNumbersList = new ArrayList<>();

        for(Integer number : list) {
            if(number % 2 == 0) {
                evenNumbersList.add(number);
            }
        }
        return evenNumbersList;
    }

    public static List<Integer> sortedList(List<Integer> list) {

        List<Integer> sortedList = new ArrayList<>();

        sortedList.addAll(list);
        Collections.sort(sortedList);

        return sortedList;
    }

//Napisz metodę, która zwróci najczęściej występującą wartość z listy
    public static int occurrenceCounter(List<Integer> list) {

        int occurenceCounter = 0;
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);

        Map<Integer, Integer> occurenceCounterMap = new HashMap<>();

        for (Integer number : sortedList) {

            if (occurenceCounterMap.containsKey(number)) {
                occurenceCounter = occurenceCounter + 1;
            } else {
                occurenceCounter = 1;
            }
            occurenceCounterMap.put(number, occurenceCounter);
        }

        System.out.println("Created map: " + occurenceCounterMap.toString());

        Collection<Integer> collectionOfValues = occurenceCounterMap.values();
        System.out.println("Created list of collectionOfValues: " + collectionOfValues);


        List<Integer> listOfValues = new ArrayList<>();
        listOfValues.addAll(collectionOfValues);

        Collections.sort(listOfValues);
        int listOfValuesLastIndex = listOfValues.size() - 1;

        return listOfValues.get(listOfValuesLastIndex);
    }

    // Napisz metodę, która w posortowanej liście zwróci największą wartość

    public static int maxValueOfSortedList(List<Integer> list) {

        if(list.isEmpty()) {
            return 0;
        }
        System.out.println("Unsorted list: " + list);
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        System.out.println("Sorted list: " + sortedList);

        return sortedList.get(sortedList.size()-1);
    }

    // Napisz metodę, która w posortowanej liście zwróci najmniejszą wartość

    public static int minValueOfSortedList(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);

        return sortedList.get(0);
    }

}
