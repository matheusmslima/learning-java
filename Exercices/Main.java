package Exercices;

import Math.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        Calculator calculator = new Calculator();
        int sum = calculator.SumTwoIntNumbers(numberA, numberB);

        scanner.close();

        System.out.println(sum);
        return;
    }
}
