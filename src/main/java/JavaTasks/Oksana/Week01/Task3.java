package JavaTasks.Oksana.Week01;

public class Task3 {
    /*
    ### 3. odd & even
   Write  a method which can identifies given number is even or odd
`java
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
     */
    public static void main(String[] args) {
        System.out.println(oddOrEven(36));
        System.out.println(oddOrEven(21));

    }

    public static String oddOrEven(int num) {
        String result = "Odd";
        if (num % 2 == 0) {
            result = "Even";
        }
        return result;
    }
}
