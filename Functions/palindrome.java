import java.util.*;

public class palindrome {

    public static boolean isPalin(int n) {
        int num = n;
        int rev = 0;
        while (n > 0) {

            int LastD = n % 10;

            rev = (rev * 10) + LastD;

            n = n / 10;
        }
        if (num == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (isPalin(n)) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }

    }
}
