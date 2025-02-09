package Dreamer.DSA.TwoPointer;

public class ContainerWithMostWater {
    public static void main(String[] args) {

        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(container(height));
    }

    public static int container(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int water = 0;
        while (left < right) {
            water = Math.max(water, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;

            } else {
                right--;
            }

        }
        return water;
    }

}
