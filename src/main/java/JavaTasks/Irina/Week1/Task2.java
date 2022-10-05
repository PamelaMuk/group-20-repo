package JavaTasks.Irina.Week1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] arr = {56, 524, 25,
                93, 918};
        int n = arr.length;
        System.out.println("Largest number from the Array: " + largest(arr, n));
    }

    //### 2. Array - Find largest
    //Write a method that can find the largest number from an int Array

    public static int largest(int []arr, int n)
    {
        Arrays.sort(arr);
        return arr[n - 1];
    }
}
