package JavaTasks.Irina.Week2;

public class Task2 {
    /*
    ### 2. FINRA
    Write a method which prints out the numbers from 1 to 30:
    For numbers which are a multiple of 3, print "FIN" instead of the number;
    For numbers which are a multiple of 5, print "RA" instead of the number;
    For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
    */

    public static void printNumbers() {

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printNumbers();
    }
}
