class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String ans = "";
        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            for(int j=word.length()-1;j>=0;j--){
               ans =ans+word.charAt(j);
            }
            ans=ans+" ";
        }
        ans = ans.trim();
        return ans;
    }
}