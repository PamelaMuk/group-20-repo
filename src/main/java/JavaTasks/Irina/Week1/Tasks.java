package JavaTasks.Tasks.Irina.Week1;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));


        System.out.println("========================");


        int []arr = {56, 524, 25,
                93, 918};
        int n = arr.length;
        System.out.println("Largest number from the Array: " + largest(arr, n));


        System.out.println("========================");


        System.out.println(evenOdd());


    }

    //# JAVA TASKS WEEK01
    //### 1. String - Frequency of Characters
    //Write a return method that can find the frequency of characters
    //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static String countLetters(String str){

        String result ="";

        for(int i = 0; i < str.length(); i++){
            int count = 0;

            if (!result.contains(""+str.charAt(i))) {

                for(int j = 0; j < str.length(); j++ ){

                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                result += str.charAt(i) + "" + count;
            }
        }
        return result;
    }

    //### 2. Array - Find largest
    //Write a method that can find the largest number from an int Array

    public static int largest(int []arr,
                       int n)
    {
        Arrays.sort(arr);
        return arr[n - 1];
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
