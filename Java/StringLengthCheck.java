import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get string value input from user
        System.out.print("Name: ");
        String name = scanner.nextLine();
        int length = stringLength(name);
        System.out.println(length);
    }

    public static int stringLength(String s) {
        int i = 0;
        // value of i = '0' in the String variable 'name', if it's != '\0' (it's not null and it's actual character?) then loop
        while (s.charAt(i) != '\0') {
            //let's increment i by 1 and store value to i = 1 each time, the program store value in memory.
            i++;
        }
        // return i value and then other function can use;
        return i;
    }
}
