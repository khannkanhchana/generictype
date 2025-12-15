package co.istad.generictype;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator<Double, Float> cal = new Calculator<>(12.5, 2.5F);

        do{
            System.out.print("Enter operation : ");
            String op = scanner.nextLine();

            Double result = switch (op){
                case "+" -> cal.getValue1() + cal.getValue2();
                case "-" -> cal.getValue1() - cal.getValue2();
                case "*" -> cal.getValue1() * cal.getValue2();
                case "/" -> cal.getValue1() / cal.getValue2();
                default -> throw new IllegalStateException("Unexpected value: " + op);
            };

            System.out.println("The result is : "+ result);
        }while (true);
    }
}
