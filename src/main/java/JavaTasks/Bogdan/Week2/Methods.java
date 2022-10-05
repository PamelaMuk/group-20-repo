package JavaTasks.Bogdan.Week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Methods {
    public static double division(double a, double b){
        double result = 0;
        while( a >= b){
            a = a - b;
            result++;
        }
        return result;
    }

    public static String finRa(){
        String result = "";
        for( int i = 0; i <= 30; i++){
            if( i % 3 == 0 && i % 5 == 0){
                result += "FINRA";
            }else if(i % 3 == 0){
                result += "FIN";
            }else if(i % 5 == 0){
                result += "RA";
            }
        }
        return result;
    }

    public static List<Integer> swap(List<Integer> list) {
        Collections.swap(list, 0, 1);
        return list;
    }

    public static void main(String[] args) {




        System.out.println(division(17,5));
        System.out.println(finRa());
        List<Integer> list = new ArrayList<>(Arrays.asList(5,32));
        System.out.println(swap(list));
    }

}
