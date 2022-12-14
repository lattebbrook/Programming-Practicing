import java.util.Scanner;

public class BasicReverseString {

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        // Use new StringBuilder to shorten the syntax or alternatively use for loop.
        String reversed = new StringBuilder(userInput).reverse().toString();
        System.out.println(reversed);

    }
}
