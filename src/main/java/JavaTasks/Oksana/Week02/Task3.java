package JavaTasks.Oksana.Week02;

import java.util.Scanner;

public class Task3 {
    /*
    ### 3. Swap Numbers
Swap two variable' values without using a third variable
     */

    public static void main(String[] args) {

        System.out.println("Enter the value of x and y");
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Before swapping numbers: " + x + " " + y);

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: " + x + "  " + y);
    }
}



