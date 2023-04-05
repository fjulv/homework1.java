package hw1;

import java.util.Scanner;

//Вывести все простые числа от 1 до 1000.
//простое число - то число которое делится без остатка только на 1 и на само себя (1 - это не простое число);
public class Task3 {
    public static void primeNumber() {
        System.out.println("Введи положительное число: ");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i);
            else isPrime = true;
        }
    }
}