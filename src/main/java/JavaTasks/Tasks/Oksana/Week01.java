package JavaTasks.Tasks.Oksana;


import java.util.Arrays;

public class Week01 {
    /*
    ### 1. String - Frequency of Characters
Write a return method that can find the frequency of characters
`
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
`

### 2. Array - Find largest
Write a method that can find the largest number from an int Array

### 3. odd & even
   Write  a method which can identifies given number is even or odd
`java
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
`
     */
    public static String frequencyOfChars(String str){
        String result ="";
        for(int i = 0; i < str.length(); i++){
            int count = 0;
            if (!result.contains("" + str.charAt(i))) {
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

    public static int largestNum(int[]arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static String oddOrEven(int num) {
        String result = "Odd";
        if (num % 2 == 0) {
            result = "Even";
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDDEFGAA"));
        System.out.println("-------------------------------------");

        int[] nums = {34, 2, 16, 67, 13, 44, 25};
        System.out.println(largestNum(nums));
        System.out.println("-------------------------------------");

        System.out.println(oddOrEven(36));
        System.out.println(oddOrEven(21));
        System.out.println("-------------------------------------");


    }

}
