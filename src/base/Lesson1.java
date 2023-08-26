package base;

public class Lesson1 {
    public static void printResult() {
        System.out.println("Урок 1: Типы данных");

        // byte (Byte) - от -128 до 127 (8 бит)
        // short (Short) - от -32768 до 32767 (16 бит)
        // int (Integer) - от -2147483648 до 2147483647 (32 бит)
        // long (Long) - -9223372036854775808L до 9223372036854775807L (64 бит). Постфикс l или L обозначает литералы типа long
        // float (Float) - от 1.4e-45f до 3.4e+38f (32 бит). При использовании типа float требуется указывать суффикс f или F
        // так как без них типом литерала будет считаться double
        // double (Double) - от 4.9e-324 до 1.7e+308 (64 бит)
        // boolean (Boolean) - true/false (8 бит (в массивах), 32 бит (не в массивах используется int))
        // char (Character) - символ (8 бит)
        // String - указывается в двойных кавычках, любая строка

        String name = "Jhon";
        byte age = 20;

        System.out.println("Hello! My name is " + name + ", i'm " + age + " years old");
    }
}
