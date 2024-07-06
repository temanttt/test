public class Main {
//https://leetcode.com/problems/add-binary/
    public String addBinary(String a, String b) {
        return  Long.toBinaryString(Long.parseLong(a, 2) + Long.parseLong(b, 2));

    }
//https://leetcode.com/problems/number-of-1-bits/
    public int hammingWeight(int n) {
        int result = 0;
        while(n!=0) {
            if ((n&1)==1){
                result++;}
                n=n>>1;
        }
        return result;
    }
   // https://leetcode.com/problems/number-complement/
    public static int findComplement(int num) {
        int mask = (Integer.highestOneBit(num) - 1);
        return ~num & mask;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(findComplement(5)));
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(2));
        System.out.println((Integer.toBinaryString(1)));
        System.out.println(Integer.parseInt("0101",10));
        System.out.println(Integer.toBinaryString(Integer.parseInt("11111010", 2) + Integer.parseInt("00000001", 2)));
        System.out.println((Integer.highestOneBit(4))-1);
    }
}