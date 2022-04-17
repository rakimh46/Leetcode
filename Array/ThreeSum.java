import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            int j = i + 1, k = n - 1;
            while (j < k) {
                if (nums[j] + nums[k] == -nums[i]) {
                    List<Integer> t = new ArrayList<Integer>();
                    t.add(nums[i]);
                    t.add(nums[j]);
                    t.add(nums[k]);

                    ans.add(t);

                    while (j + 1 < k && nums[j + 1] == nums[j])
                        j++;
                    while (k - 1 > j && nums[k - 1] == nums[k])
                        k--;

                    j++;
                    k--;
                } else if (nums[j] + nums[k] < -nums[i])
                    j++;
                else
                    k--;
            }

            while (i + 1 < n && nums[i + 1] == nums[i])
                i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        for (List<Integer> list : threeSum(new int[] { -1, 0, 1, 2, -1, -4 })) {
            for (int x : list)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
