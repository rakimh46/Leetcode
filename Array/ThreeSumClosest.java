import java.util.Arrays;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = 0;
        int diff=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int currSum = nums[i] + nums[start] + nums[end];

                if(currSum==target){
                    return target;
                }else if(Math.abs(currSum-target)<diff){
                    diff=Math.abs(currSum-target);
                    ans=currSum;
                }
                if (currSum > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
       System.out.println(threeSumClosest(new int[] {-1,2,1,-4},1));
    }
}