import java.util.Scanner;

public class BasicCalculator {

    public static void main(String args[])
    {
        System.out.println("Instruction, input first and then second number i.e. 1 and 1 then enter to get result");
        Scanner sc = new Scanner(System.in);
        double inputFirst = sc.nextDouble();
        char operator = '+';
        double inputSecond = sc.nextDouble();

        //enhance switch for Java 9.
        switch (operator) {
            case '+' -> System.out.println(inputFirst+inputSecond);
            case '-' -> System.out.println(inputFirst-inputSecond);
            case '*' -> System.out.println(inputFirst*inputSecond);
            case '/' -> System.out.println(inputFirst/inputSecond);
            default -> System.out.println("Invalid operator");
        }

    }
}
