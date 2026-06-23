package arrays;

public class two-sum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i =0; i<nums.length;i++) {
            for(int j=i+1; j<nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }    

    public static void main(String[] args) {
        int[] nums = {2,3,11,15};
        int target = 13;
        int[] res = twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
        
    }
}    

