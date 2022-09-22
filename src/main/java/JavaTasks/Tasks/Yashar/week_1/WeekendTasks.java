package JavaTasks.Tasks.Yashar.week_1;

public class WeekendTasks {
    public static void main(String[] args) {
        System.out.println(findFrequency("AAAABYBYBYCDD"));
        int[] nums = {1, 2, 3, 4};
        System.out.println(findLargest(nums));
        System.out.println(oddOrEven(5));
        System.out.println(oddOrEven(6));
    }

    public static String findFrequency(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char l = s.charAt(i);
            int count = 0;
            if (res.contains(l + "")) {
                continue;
            }
            for (int j = 0; j < s.length(); j++) {
                char k = s.charAt(j);
                if (k == l) {
                    count++;
                }
            }
            res += count + "" + l;
        }
        return res;
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
