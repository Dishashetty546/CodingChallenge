package Arrays;

public class NuSumOfDistintPowersOfThree {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(Distinct(n));

    }

    public static boolean Distinct(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            }
            n = n / 3;
        }
        return true;

    }

}
