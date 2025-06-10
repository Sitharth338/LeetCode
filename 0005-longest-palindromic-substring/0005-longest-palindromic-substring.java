class Solution {
    public String longestPalindrome(String s) {
        String longest = "";  //0 
        for(int i=0;i<s.length();i++){
               String odd = palindrome(s,i,i);
               String even = palindrome(s,i,i+1);
               if (odd.length() > longest.length()) {
                longest = odd;
            }
            if (even.length() > longest.length()) {
                longest = even;
            }
           
        }
         return longest;
    }

     static String palindrome(String s , int left,int right){
            while(left>=0 && right<s.length()  && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            return s.substring(left + 1, right);
        }
    
}