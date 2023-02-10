import java.util.Scanner;
public class Prime_in_range {

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        // for(int i =2; i<n; i++){
        for(int i =2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
                }   
        }
        return true;
        }

    public static void PrimeInRange(int n){
        for(int i = 2; i<=n; i++){
            if(isPrime(i) == true){
                System.out.print(i +"  ");
            }
        }
    }
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number upto which you want to find prime number");
        int n = sc.nextInt();
        PrimeInRange(n);
    }
}
