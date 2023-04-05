package hw1;

import java.util.Scanner;

//n! (произведение чисел от 1 до n)
public class Task2 {
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи целое число: ");
        int number = scanner.nextInt();
        int res = 1;
        for (int i = 1; i <= number; i++) {
            if (number == 0) {
                System.out.println("Факториал числа 0 = 1");
            } else {
                res = res * i;
            }

        }
        System.out.println("Факториал числа " + number + " равен " + res);

    }
}
