package ie.atu;

import java.util.Scanner;

public class Calc2024 {
    public static void main(String[] args) {
        System.out.println("Please enter first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please enter second number: ");
        int b = sc.nextInt();
        System.out.println("Please enter an operation: ");
        String op = sc.next();
        switch (op){
            case "add": add(a, b); break;
            case "multiply": multiply(a, b); break;
            case "divide" : divide(a, b); break;
        }
    }
    public static void add(int a, int b) {
       int sum = a + b;
       System.out.println("The sum is: " + sum);
    }
    public static void multiply(int a, int b){
        int product = a * b;
        System.out.println("The sum is: " + product);
    }
    public static void divide(int a, int b){
        int division = a / b;
        System.out.println("The sum is: " + division);
    }
}
