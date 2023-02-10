import java.util.Scanner;
public class Odd_evenSum {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int number;
        int evenSum = 0;
        int oddSum = 0;
        int choice;
        do{
                System.out.print("Enter a number : ");
                number = sc.nextInt();
        
                if(number % 2 == 0){
                     evenSum = evenSum + number;
                }
                else{
                     oddSum = oddSum + number;
                }
        
                System.out.println("If you want to continue press 1 otherwise press 0 ");
                choice = sc.nextInt();
            }while(choice == 1);
        
            System.out.println("sum of even numbers is : " + evenSum);
            System.out.println("sum of odd numbers is : " + oddSum);
        
    }
}
