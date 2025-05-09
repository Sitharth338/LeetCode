class Solution {
    public String intToRoman(int num) {
       int[] integer  = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] roman = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    StringBuilder sb = new StringBuilder();

       for(int i=0;i<integer.length;i++){

        if(num==0){
            break;
        }

        while(num>=integer[i]){
            sb.append(roman[i]);
            num=num-integer[i];
        }
       }

       return sb.toString();

    }
}