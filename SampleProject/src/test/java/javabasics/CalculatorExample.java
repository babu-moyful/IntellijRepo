package javabasics;

public class CalculatorExample {

    public static void main(String[] args) {

        int a = 100 ;
        int b = 200 ;
        String operator = "-";

        if (operator.equals("+")) {

            System.out.println(a + b);
        }
        else if (operator.equals("-")) {

            System.out.println(a - b);

        }
        else if (operator.equals("*")) {

            System.out.println(a * b);

        }
        else if (operator.equals("/")) {
            System.out.println(a / b);

        }
        else {
            System.out.println("enter the valid operator");
        }
    }
}
