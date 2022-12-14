import java.util.Scanner;

public class BasicCalculator {

    public static void main(String args[])
    {
        System.out.println("Instruction, input first and then operator then second number i.e. 1 + 1 then enter to get result");
        Scanner sc = new Scanner(System.in);
        double inputFirst = sc.nextDouble();
        char operator = '+';
        double inputSecond = sc.nextDouble();

        switch (operator) {
            case '+':
                System.out.println(inputFirst+inputSecond);
                break;
            case '-':
                System.out.println(inputFirst-inputSecond);
                break;
            case '*':
                System.out.println(inputFirst*inputSecond);
                break;
            case '/':
                System.out.println(inputFirst/inputSecond);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

    }
}
