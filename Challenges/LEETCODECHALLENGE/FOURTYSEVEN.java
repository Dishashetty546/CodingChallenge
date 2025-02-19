package Challenges.LEETCODECHALLENGE;
//MAXIMUM ODD BINARY NUMBER

//given binary no string that contains atleast 1 rearrang bit and create highest possible odd num

//ex: 010

//max odd number to this is 001

//hint: evey odd number has 1 as its last bit, ex: 001, 011, 101, 1001 etc

//ex: 01100011
// first push one 1 to last bit possible  =>  -------1
//then put all 0's to last => ---00001
//then put remaining 1 to remaining places 11100001 => this is largest odd that can be designed
public class FOURTYSEVEN {
    public static void main(String[] args) {
        String s = "010";
        System.out.println(binary(s));

    }

    public static StringBuilder binary(String s) {
        // step 1: count number of 0's and 1 's'
        int countz = 0;
        int count1 = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                countz++;
            } else {
                count1++;
            }

        }
        // step 2: now that I know , I have 4 0's and 4 1's
        // build a result string, use StringBuilder to do that
        StringBuilder result = new StringBuilder();

        count1--;
        result.append("1".repeat(count1));
        result.append("0".repeat(countz));
        result.append(1);
        return result;
    }

}
