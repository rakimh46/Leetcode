// Ques 1
// https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static void main(String[] args) {
        // int[] nums={2,7,11,15};
        // int target=9;
        int[] arr = twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]+" ");
        }
        System.out.println("]");
    }

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + arr[i + 1] == target) {
                return new int[] { i, ++i };
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int jNum = target - arr[i];
                if (jNum == arr[j]) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { 0, 0 };
    }
}