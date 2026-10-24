package ru.mirea;


public class Main {
    public static void main(String[] args) {
        // Задание 3
        int[] a = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Сумма:");
        System.out.println(sum);
        System.out.println("Среднее:");
        System.out.println((double) sum / a.length);

        // Задание 4
        int[] b = {4, -2, 7, 10, 1};

        int n = b.length;

        int sum1 = 0;
        int i = 0;
        do {
            sum1 += b[i];
            i++;
        } while (i < n);

        int sum2 = 0;
        i = 0;
        while (i < n) {
            sum2 += b[i];
            i++;
        }

        int min = b[0];
        int max = b[0];
        for (i = 0; i < n; i++) {
            if (b[i] < min) {
                min = b[i];
            }
            if (b[i] > max) {
                max = b[i];
            }
        }

        System.out.println("Сумма do while:");
        System.out.println(sum1);
        System.out.println("Сумма while:");
        System.out.println(sum2);
        System.out.println("Минимум:");
        System.out.println(min);
        System.out.println("Максимум:");
        System.out.println(max);

        // Задание 5
        System.out.println("Аргументы программы:");
        for (i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        // Задание 6
        System.out.println("Гармонический ряд:");
        for (i = 1; i <= 10; i++) {
            System.out.println(1.0 / i);
        }

        // Задание 7
        System.out.println("Факториал числа 5:");
        System.out.println(factorial(5));
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
