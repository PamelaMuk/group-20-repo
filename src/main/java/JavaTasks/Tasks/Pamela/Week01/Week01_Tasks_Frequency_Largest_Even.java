package JavaTasks.Tasks.Pamela.Week01;

public class Week01_Tasks_Frequency_Largest_Even {
    public static void main(String[] args) {

        System.out.println("The frequency is: "+findFrequency("aaaaabbbbccdddddeeeee"));
        int[] nums = {10, 57, 79, 99,150};
        System.out.println("The biggest number is: "+ biggestNumber(nums));
        System.out.println("The number is: "+evenOrOdd(9));
        System.out.println("The number is: "+evenOrOdd(4));
    }


    //### 1. String - Frequency of Characters
//Write a return method that can find the frequency of characters
    public static String findFrequency(String s) {
        String total = "";

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int count = 0;
            if (total.contains(a + "")) {
                continue;
            }
            for (int j = 0; j < s.length(); j++) {
                char k = s.charAt(j);
                if (k == a) {
                    count++;
                }
            }
            total += count + "" + a;
        }
        return total;
    }

//### 2. Array - Find largest
//Write a method that can find the largest number from an int Array

    public static int biggestNumber(int[] num) {
        int bigger = num[0];
        for (int each : num) {
            if (each > bigger) {
                bigger = each;
            }
        }
        return bigger;
    }
   // ### 3. odd & even
    //Write  a method which can identifies given number is even or odd
   public static String evenOrOdd(int numb) {
       String str = "odd";
       if (numb % 2 == 0) {
           str = "even";
       }
       return str;
   }

}