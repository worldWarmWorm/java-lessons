package base;

public class Lesson4 {
    public static void printResult() {
        System.out.println("Урок 4: Циклы и операторы в них (For, While, Do while)");

//        for (float i = 100; i > 1; i /= 2) {
//            System.out.println("Элемент: " + i);
//        }

        float i = 100;
//
//        while (i > 1) {
//            System.out.println("Элемент: " + i);
//            i /= 2;
//        }

        do {
//            if (i == 50.0) {
//                continue;
//            }

            if (i == 6.25) {
                break;
            }

            System.out.println("Элемент: " + i);
            i /= 2;
        } while (i > 1);
    }
}
