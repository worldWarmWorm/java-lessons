package base;

import java.util.Scanner;

public class Lesson2 {
    public static void printResult() {
        System.out.println("Урок 2: Данные от пользователя. Математические действия");

        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите ваше имя");
//        String username = scanner.nextLine();
//        System.out.println("Привет, " + username + "!");

//        float a = 50;
//        float b = 30;
//        float x = a + b;
//        ++x;
//
//        System.out.println(x);

        System.out.print("Введите первое слогаемое: ");
        float a = scanner.nextFloat();

        System.out.print("Введите второе слогаемое: ");
        float b = scanner.nextFloat();

        float res = a + b;
        float res2 = a - b;
        float res3 = a * b;
        float res4 = a / b;

        System.out.println("Результаты математических операций:");
        System.out.println("Сложение - " + res);
        System.out.println("Вычитание - " + res2);
        System.out.println("Умножение - " + res3);
        System.out.println("Деление - " + res4);
    }
}
