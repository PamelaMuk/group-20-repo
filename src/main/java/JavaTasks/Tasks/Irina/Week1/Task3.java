package JavaTasks.Tasks.Irina.Week1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(evenOdd());
    }
    //### 3. odd & even
    //   Write  a method which can identifies given number is even or odd
    //`java
    //EX:
    //identify(5) ->  "Odd"
    //identify(6) ->  "Even"

    public static String evenOdd(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = scan.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        return evenOdd;

    }
}
