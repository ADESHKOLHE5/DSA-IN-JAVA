package BasicString2;

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
}
