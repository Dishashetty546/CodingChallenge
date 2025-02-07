package Dreamer.DSA.ArrayNDstring;

//given a heights of the brick 
public class Trappingwater {
    public static void main(String[] args) {
        int[] height = { 4, 2, 8, 3, 2, 5 };
        System.out.println(trapping(height));

    }

    public static int trapping(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = height[0];
        right[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++) {
            if (height[i] > left[i - 1]) {
                left[i] = height[i];
            } else {
                left[i] = left[i - 1];
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (height[i] > right[i + 1])

            {
                right[i] = height[i];

            } else {
                right[i] = right[i + 1];
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            int x = Math.min(left[i], right[i]);
            result = result + x - height[i];
        }
        return result;

    }

}
