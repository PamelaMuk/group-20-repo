package JavaTasks.Tasks.Bogdan;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Week01 {
    public static String frequencyOfCharacters(String str){

        String result = "";

        for (String each : new TreeSet<>(Arrays.asList(str.split("")))) {

            int freq = Collections.frequency(Arrays.asList(str.split("")),each);

            result+=each+ freq;

        }

        return result;
    }

    public static int largestNumber(int[]arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static String identifyTurnary(int number){

        return number % 2 == 0 ? "Even" : "Odd";

    }





}
