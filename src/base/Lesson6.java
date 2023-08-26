package base;

import java.util.LinkedList;

public class Lesson6 {
    public static void printResult() {
        System.out.println("Урок 6: Коллекции в Джава (Collections Framework)");

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(8);
//        numbers.add(1, 90);
//
//        System.out.println(numbers.get(1));
//
//        numbers.remove(1);
//        System.out.println(numbers.get(1));

//        for (Integer number: numbers) {
//            System.out.println(number);
//        }

        LinkedList<Float> list = new LinkedList<>();
        list.add(4.3f);
        list.add(8.355f);
        list.add(4.9865f);

        for (Float item: list) {
            System.out.println("Element: " + item);
        }
    }
}
