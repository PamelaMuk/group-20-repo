package JavaTasks.Tasks.obaydah;

public class Week1Tasks {
    public static void main(String[] args) {
        System.out.println(findFrequency("FGGKKDDVVJJGFGDD"));
        int[] nums = {3, 6, 9, 21, 15, 18, 12};
        System.out.println(findLargest(nums));
        System.out.println(oddOrEven(5));
        System.out.println(oddOrEven(6));
    }

    public static String findFrequency(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char l = s.charAt(i);
            int count = 0;
            if (str.contains(l + "")) {
                continue;
            }
            for (int j = 0; j < s.length(); j++) {
                char k = s.charAt(j);
                if (k == l) {
                    count++;
                }
            }
            str += count + "" + l;
        }
        return str;
    }

    public static int findLargest(int[] nums) {
        int biggest = nums[0];
        for (int each : nums) {
            if (each > biggest) {
                biggest = each;
            }
        }
        return biggest;
    }

    public static String oddOrEven(int num) {
        String res = "odd";
        if (num % 2 == 0) {
            res = "Even";
        }
        return res;
    }

}

