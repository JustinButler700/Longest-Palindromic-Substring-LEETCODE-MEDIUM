//Justin Butler 10/16/2021
class Solution {
    public String longestPalindrome(String s) 
    {
        if(s.length()<2){return s;} // edge case handling
        String longest = "";
        for(int i = 0; i < s.length(); i++)
        {
            String even = expandFromIndex(s,i,i);
            if(longest.length()<even.length()){longest = even;} // Case even length Palindrome
            String odd = expandFromIndex(s,i,i+1);
            if(longest.length()<odd.length()){longest = odd;} // case odd length Palindrome
        }
        return longest;
    }
    //Expands Linearly on both sides and  returns the current longest palindromic substring
    public String expandFromIndex(String s, int left, int right)
    {
        while(left>= 0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return(s.substring(left+1,right));
    }
}
