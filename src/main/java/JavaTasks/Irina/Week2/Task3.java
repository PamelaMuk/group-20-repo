package JavaTasks.Irina.Week2;

public class Task3 {
    /*
    ### 3. Swap Numbers
    Swap two variable' values without using a third variable
     */

    public static void main(String[] args) {
        int x = 20;
        int y = 7;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Swapped numbers: " + "x = " + x + "; y = " + y);
    }
}
