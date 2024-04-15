import java.util.Scanner;
public class Reverse_a_Number {

    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int var = number;
        int rev = 0;

        while(var>0){
            int lastdigit = var % 10;
            var = var/10;
            rev = (rev*10) + lastdigit;
        }
        System.out.println("Reverse of " + number + " is " + rev);
    }
    
}
