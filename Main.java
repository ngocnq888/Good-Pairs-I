import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Good Pair Executed!");
        int[] nums1 = new int[]{1, 2, 4, 12};
        int[] nums2 = new int[]{2, 4};
        int k = 3;
        System.out.println("result: " + numberOfPairs(nums1, nums2, k));
    }


    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        if (0 > k || nums1.length == 0 || nums2.length == 0) {
            throw new IllegalArgumentException("Invalid K argument!");
        }
        List<Integer> goodPairs = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] % (nums2[j] * k) == 0) {
                    goodPairs.add(i);
                    goodPairs.add(j);
                    count++;
                }
            }
        }
        for (int c = 0; c < goodPairs.size(); c += 2) {
            System.out.println("Data: (" + goodPairs.get(c) + ", " + goodPairs.get(c + 1) + ") ");
        }
        return count;
    }
}
