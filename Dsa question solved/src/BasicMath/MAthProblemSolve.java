package BasicMath;

public class MAthProblemSolve {
    static void PrintDigits(int n) {
        while (n != 0) {
            int last = n%  10;
            System.out.println(last + " ");
            n=n/10;
        }

    }
    static int CountDigits(int n) {
        int count = 0;
        while (n != 0) {
            int last = n%  10;
            n=n/10;
            count++;
        }
        return count;

    }
    static int SumOfDigits(int n) {
       int sum = 0;
        while (n != 0) {
            int last = n%  10;
            sum += last;
            n=n/10;
        }
        return sum;
    }
    static int ReverseNum(int n) {
        int reverse = 0;
        while (n != 0) {
            int last = n%  10;
            reverse = reverse * 10 + last;
            n=n/10;
        }
        return reverse;
    }
    static boolean isPalindrome(int n) {
        int reverseNumber = ReverseNum(n);
        return reverseNumber == n;
    }

    public static void main(String[] args) {
        System.out.println(MAthProblemSolve.isPalindrome(121)); ;

    }
}
