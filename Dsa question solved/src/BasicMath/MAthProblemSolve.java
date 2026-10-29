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
    static boolean isPrimeNumber(int n) {
        if(n<=1) return false;
        boolean primeNumber = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) primeNumber = false;
        }
        return primeNumber;
    }
    static int HCFNumber(int a, int b) {
        // gcd(a, b) = gcd(b, a % b)

        while (b != 0) {
            int oldValueOfB = b;
            b = a % b;
            a = oldValueOfB;
        }

        return a;
    }
    static int getLcm(int a, int b) {
        int gcd = HCFNumber(a, b);
        int product =a*b;
        return product/gcd;
    }
    static boolean ArmStrongNum(int num) {
        int original = num;
        int sum = 0;

        int digits = String.valueOf(num).length();

        while (num != 0) {
            int rem = num % 10;
            sum = sum + (int) Math.pow(rem, digits);
            num = num / 10;
        }

        return sum == original;
    }
    public static void main(String[] args) {
        System.out.println(MAthProblemSolve.ArmStrongNum(1634)); ;

    }
}
