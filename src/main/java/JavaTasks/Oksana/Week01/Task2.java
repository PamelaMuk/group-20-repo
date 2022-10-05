package JavaTasks.Oksana.Week01;

import java.util.Arrays;

public class Task2 {
    /*
    ### 2. Array - Find largest
Write a method that can find the largest number from an int Array
     */

    public static void main(String[] args) {
        int[] nums = {34, 2, 16, 67, 13, 44, 25};
        System.out.println(largestNum(nums));
        System.out.println("-------------------------------------");

    }

    public static int largestNum(int[]arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

}
