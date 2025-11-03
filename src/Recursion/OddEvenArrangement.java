package Recursion;

public class OddEvenArrangement {
    public static int[] rearrange(int[] nums) {
        int[] res = new int[nums.length];
        int even = 0, odd = 1;
        for (int n : nums) {
            if (n % 2 == 0) {
                res[even] = n;
                even += 2;
            } else {
                res[odd] = n;
                odd += 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {4, 2, 5, 7};
        System.out.println(java.util.Arrays.toString(rearrange(nums1)));
        System.out.println(java.util.Arrays.toString(rearrange(nums2)));
    }
}
