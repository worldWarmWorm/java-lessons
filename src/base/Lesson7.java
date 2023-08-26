package base;

public class Lesson7 {
    public static void printResult() {
        System.out.println("Урок 7: Функции в Джава");

//        info("result: " + sum(5, 6));

        int[] array = new int[] {1, 2, 3};

        System.out.println("result is " + getSumOfArrayItems(array));
    }

//    public static void info(String text) {
//        System.out.println(text);
//    }
//
//    public static int sum(int a, int b) {
//        return a + b;
//    }

    public static int getSumOfArrayItems(int[] array) {
        int result = 0;

        for (int item: array) {
            result += item;
        }

        return result;
    }
}
