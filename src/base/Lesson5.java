package base;

import java.util.Scanner;

public class Lesson5 {
    public static void printResult() {
        System.out.println("Урок 5: Массивы данных. Одномерные и многомерные массивы");

        // Одномерные массивы данных
//        int[] nums = new int[5];
//
//        nums[0] = 1;
//        nums[1] = 12;
//        nums[2] = 13;
//        nums[3] = 14;
//        nums[4] = 16;
//
//        int res = nums[1] + nums[2];
//
//        System.out.println(res);

//        float[] nums2 = new float[] {5.0f, 6.46f, 89.984f};

//        for (int i = 0; i < nums2.length; i++) {
//            System.out.println(nums2[i]);
//        }

//        System.out.println(Arrays.toString(nums2));

//        int[] arr = new int[4];
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Введите число: ");
//            int value = scanner.nextInt();
//            arr[i] = value;
//        }
//
//        int min = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//
//        System.out.println("Min value is: " + min);





        // Многомерные массивы данных

        int [][] arr = new int[][] {
                {2, 4},
                {5, 6}
        };

        Scanner scanner = new Scanner(System.in);
//
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите число: ");
                int value = scanner.nextInt();
                arr[i][j] = value;
            }
        }

        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        System.out.println("Min value is: " + min);
    }
}
