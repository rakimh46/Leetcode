public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        // int water=0;
        // int i = 0;
        // int j = height.length - 1;
        // while (i < j) {
        //     water = Math.max(water,(j - i) * Math.min(height[i], height[j]));
        //     if (height[i] < height[j]) {
        //         i++;
        //     } else {
        //         j--;
        //     }
        // }

        // return water;

        //2nd method
        if(height == null || height.length == 0) return 0;
        int water = 0, l = 0, r = height.length-1;
        while(l < r) {
            int h = Math.min(height[l], height[r]);
            water = Math.max(water, (r - l) * h);
            while(l < r && height[l] <= h) l++;
            while(l < r && height[r] <= h) r--;
        }
        return water;
    }

    

    public static void main(String[] args) {
        int ans = maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 });
        System.out.println(ans);

    }
}
