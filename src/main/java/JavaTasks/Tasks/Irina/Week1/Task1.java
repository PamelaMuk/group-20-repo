package JavaTasks.Tasks.Irina.Week1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));

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
}
