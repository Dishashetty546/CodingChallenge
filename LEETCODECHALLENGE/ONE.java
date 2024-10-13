package LEETCODECHALLENGE;
//MERGE SORTED ARRAY

//approach , take 2 variable, element 1, element 2
//and take 2 pointers p1 nd p2, p1 is pointing on last element of array1, p2 pointing on last element of array2
//p3 is an array ro store merge sorted array
//first take element 1 from array1 ,nd element 2 from array2
//if(element1>element2)
//then, nums1[p3]=element1
//decrement p3 and p1  
//this continues until the merged array is formed

public class ONE {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        merge(nums1, nums2, n, m);
        for (int num : nums1) {
            System.out.print(num + " ");
        }

    }

    public static void merge(int[] nums1, int[] nums2, int n, int m) {
        int element1, element2;
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;
        while (p3 >= 0) {
            element1 = (p1 >= 0) ? nums1[p1] : Integer.MIN_VALUE;
            element2 = (p2 >= 0) ? nums2[p2] : Integer.MIN_VALUE;
            if (element1 > element2) {
                nums1[p3] = element1;
                p3--;
                p1--;
            } else {
                nums1[p3] = element2;
                p3--;
                p2--;
            }

        }

    }

}
