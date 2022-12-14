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
        
        /*
        Traditional
        switch (.....) {
            case 1:
			//do something if value = 1
            break;
            case 2:
			//do something if value = 2
            break;
            case 3:
			//do something if value = 3
            break;
            //do something else...
            default:
            System.out.println("ERRORS");
            break;
        }
```
        */

    }
}
