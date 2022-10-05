package JavaTasks.Irina.Week2;

public class Task1 {
    /*
    ### 1. Divide without / operator
    Write a method that can divide two numbers without using division operator.
     */
    static int division(int num1, int num2){
        if(num1 == 0)
            return 0;

        if(num2 == 0)
            return Integer.MAX_VALUE;

        boolean negResult = false;

        if(num1 < 0){
            num1 = -num1;
            if(num2 < 0)
                num2 = -num2;
            else
                negResult = true;
        } else if (num2 < 0) {
            num2 = -num2;
            negResult = true;
        }
        int quotient = 0;
        while (num1 >= num2){
            num1 = num1 - num2;
            quotient++;
        }
        if(negResult)
            quotient = -quotient;
        return quotient;
    }

    public static void main(String[] args) {
        System.out.println(division(12, 2));
    }
}
