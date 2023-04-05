package hw1;

import java.util.Scanner;

//Реализовать простой калькулятор
//
//привести строку к double типу: Double.parseDouble(str); либо использовать Scanner.nextInt или nextDouble
public class Task4 {
    public static void calculator() {
        Scanner data = new Scanner(System.in);
        System.out.println("Введи число а = ");
        double a = data.nextDouble();
        System.out.println("Введи число b = ");
        double b = data.nextDouble();
        System.out.println("Выбери действие (+, -, /, *) -> ");
        char action = data.next().charAt(0);
        double answer;
        switch (action) {
            case '+':
                answer = a + b;
                break;
            case '-':
                answer = a - b;
                break;
            case '*':
                answer = a * b;
                break;
            case '/':
                answer = a / b;
                break;
            default:
                System.out.println("Ошибка. Введи корректную операцию");
                return;
        }
        System.out.println(a + " " + action + " " + b + " = " + answer);
    }
}
