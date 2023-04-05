package hw1;

import java.util.Scanner;

//Вычислить n-ое треугольного число (сумма чисел от 1 до n)
public class Task1 {
    public static void findTriangularNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи целое число: ");
        int number = scanner.nextInt();

        int num = number * (number + 1) / 2;
        System.out.println(number + "-е треугольное число равно " + num);

    }
}
