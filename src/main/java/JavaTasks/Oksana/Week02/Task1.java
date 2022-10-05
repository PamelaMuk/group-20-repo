package JavaTasks.Oksana.Week02;

public class Task1 {
    /*
    ### 1. Divide without / operator
Write a method that can divide two numbers without using division operator
     */
    public static void main(String[] args){//main method
        int num1 = 10;
        int num2 = 5;
        int divide = 0;
        int result = 0;
        divide = num1 + num2;

        while(divide > num2){
            divide = divide - num2;
            result++;
            }

        System.out.println(result);

    }
}
