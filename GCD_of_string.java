class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        if (!(str1+str2).equals(str2+str1))
            return "";

        int gcd = gcd(str1.length() , str2.length());
        return str1.substring(0 , gcd);
    }

    public int gcd(int l1 , int l2)
    {
        if (l2 == 0)
            return l1;

        else
            return gcd(l2, l1%l2);
    }
}