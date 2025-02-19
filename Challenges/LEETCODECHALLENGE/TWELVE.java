package Challenges.LEETCODECHALLENGE;
//Valid palindrome

//" a man a plan a canal panama"
//"amanaplanacanalpanama"
//"true"

//steps
//1.convert it into lowercase--> remove all the spaces and non alpabetic words
//2.  take 2 pointors i and j , one in 0th index , one in last index
//3. if element in index 0 = element in last index
//4. while(i<j)--> i++, j--
//5. 
public class TWELVE {
    public static void main(String[] args) {
        String s = "a man a plan a canal panama";
        System.out.println(palindrome(s));

    }

    public static boolean palindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "0");
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return true;
            }
            i++;
            j--;
        }
        return false;

    }
}
