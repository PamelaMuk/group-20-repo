package JavaTasks.Pamela.Week02;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int div,result=0;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the number you want to be divide by: ");
        int num2 = input.nextInt();

        while (num1>=num2){
            num1 = num1 - num2;
            result++;//
        }
        System.out.println("Division is: "+ result);
    }
}
