public class BuildArrayPermutation {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];  // Get the value at index nums[i]
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] result1 = buildArray(new int[]{0,2,1,5,3,4});
        System.out.println("Output: " + java.util.Arrays.toString(result1));

        int[] result2 = buildArray(new int[]{5,0,1,2,3,4});
        System.out.println("Output: " + java.util.Arrays.toString(result2));
    }
}