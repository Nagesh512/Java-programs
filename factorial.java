import java.util.Scanner;
public class factorial {

    public static int factorial(int n){
        int f = 1;

        for(int i = 1; i<=n; i++){
            f = f * i;
        }
        return f;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of which you want to find factorial");
        int n = sc.nextInt();
        int fact = 1;
    
        for(int i = n; i>1;i-- ){
    
            fact = fact * i;
        }
        
        // System.out.println("Factorial of "+ n + " is " +fact);
        System.out.println("Factorial of "+ n + " is " +factorial(n));

    }
    
}
