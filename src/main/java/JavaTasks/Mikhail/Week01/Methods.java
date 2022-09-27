package JavaTasks.Mikhail.Week01;

public class Methods {
//      Write a return method that can find the frequency of characters
//      Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static String freqOfChar(String str) {
        String checked = "";
        String outcome = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            if (checked.contains("" + str.charAt(i))) {
                continue;
            }

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            outcome+= count + "" + str.charAt(i);
            checked += str.charAt(i);

        }
        return outcome;
    }

    public static int largestNum( int...arr ){
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static String evenOrOdd(int num){
        String result = "";
        if (num%2==0){
            result="Even";
        }else{
            result="Odd";
        }

        return result;
    }
    }

