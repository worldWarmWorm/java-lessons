package base;

import java.util.Scanner;

public class Lesson3 {
    public static void printResult() throws Exception {
        System.out.println("Условные конструкции (if-else, switch-case)");

        // Операторы
        // ==
        // !=
        // >
        // <
        // >=
        // <=
        // ||
        // &&

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите роль: ");
//        String role = scanner.nextLine();
//
//        switch (role) {
//            case "admin", "guest", "qwerty" -> Lesson3.printRole(role);
//            default -> System.out.println("Undefined role");
//        }

//        if (role.equals("admin")) {
//            Lesson3.printRole(role);
//        } else if (role.equals("guest")) {
//            Lesson3.printRole(role);
//        } else {
//            System.out.println("Undefined role");
//        }

        System.out.print("Введите первое число: ");
        Integer num = scanner.nextInt();

        System.out.print("Введите второе число: ");
        Integer num2 = scanner.nextInt();

        System.out.print("Выберите математическую операцию: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();
        int result;

        switch (action) {
            case "+" -> result = num + num2;
            case "-" -> result = num - num2;
            case "*" -> result = num * num2;
            case "/" -> result = num / num2;
            default -> throw new Exception("[Error] Выбрана неверная математическая операция, попробуйте снова.");
        }

        System.out.println("Результат: " + result);
    }

//    private static void printRole(String role) {
//        System.out.println("You just picked role " + role + "!");
//    }
}
