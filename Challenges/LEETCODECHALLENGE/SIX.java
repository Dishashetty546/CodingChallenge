package Challenges.LEETCODECHALLENGE;

//JUMP GAME   //* 
//approavh:
//take 2 variables to store lastIndex and minreach
//start iteration from index 2
public class SIX {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 0, 0 };
        System.out.println(jump(nums));

    }

    public static boolean jump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int lastIndex = nums.length - 1;
        int maxReach = nums[0];
        for (int i = 1; i <= maxReach; i++) {
            if (maxReach >= lastIndex) {
                return true;
            } else {
                maxReach = Math.max(maxReach, nums[i] + i);
            }

        }
        return false;
    }

}
