import java.util.*;
public class odd_or_even {
    
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int number = sc.nextInt();
    if(number%2 == 0){
        System.out.println("Given number is even number");
    }
    else{
        System.out.println("Given number is odd number");
    }
    
    }

}
