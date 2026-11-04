package BasicString2;

import java.util.Arrays;

public class StingLeetcodeBasic {
       //Reverse a string
        public void reverseString(char[] s) {
            int start = 0;
            int last = s.length - 1;

            while(start < last){
                char temp = s[start];
                s[start] = s[last];
                s[last] = temp;

                start++;
                last--;
            }
        }
       //Palindrome String
        public boolean isPalindrome(String s) {

        if(s==null || s.isEmpty())
            return true;

        int start = 0;
        int end =s.length() - 1;

        while(start < end)
        {
            char cst = s.charAt(start);
            char cen = s.charAt(end);
            if(!Character.isLetterOrDigit(cst)){
                start++;
                continue;
            }
            else if(!Character.isLetterOrDigit(cen)){
                end--;
                continue;
            }
            else{
                if(Character.toLowerCase(cst) != Character.toLowerCase(cen))
                {
                    return false;
                }
                start++;
                end--;
            }

        }
        return true;
    }
    public String largestOddNumber(String num) {
        for(int i =num.length()-1; i>=0;i--){
            if((num.charAt(i)-'0')%2 != 0)
                return num.substring(0,i+1);
        }
        return "";
    }
    //longest common prefix
    public String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            String first =strs[0];
            String last =strs[strs.length - 1];
            int i;
            for(i=0; i<first.length() && i<last.length(); i++){
                if(first.charAt(i)!=last.charAt(i))
                    break;
            }
            return first.substring(0,i);

        }


}
