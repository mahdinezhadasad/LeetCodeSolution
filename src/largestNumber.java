import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class largestNumber {
    public static void main(String[] args) {
        largestNumber("589631");
    }

    public static List<Integer> largestNumber(String number) {
        int s = number.length();
        List<Integer> deneme = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();
        List<Integer> inverseSorted = new ArrayList<>();
        for (int i = 0; i < s; i++) {
            int neu = Character.getNumericValue(number.charAt(i));
            deneme.add(neu);
           // System.out.println(sortedList);
        }

        for(int i = sortedList.size()-1; i>=0; i--){
            int newValue = sortedList.get(i);
            inverseSorted.add(newValue);
           // System.out.println(inverseSorted);
        }

        String ch = inverseSorted.stream().map(String :: valueOf).collect(Collectors.joining());
        System.out.println(ch);
        return inverseSorted;


    }


        private class LargerNumberComparator implements Comparator<String> {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        }

        public String largestNumber(int[] nums) {
            // Get input integers as strings.
            String[] asStrs = new String[nums.length];
            for (int i = 0; i < nums.length; i++) {
                asStrs[i] = String.valueOf(nums[i]);
            }

            // Sort strings according to custom comparator.
            Arrays.sort(asStrs, new LargerNumberComparator());

            // If, after being sorted, the largest number is `0`, the entire number
            // is zero.
            if (asStrs[0].equals("0")) {
                return "0";
            }

            // Build largest number from sorted array.
            String largestNumberStr = new String();
            for (String numAsStr : asStrs) {
                largestNumberStr += numAsStr;
            }

            return largestNumberStr;
        }

}