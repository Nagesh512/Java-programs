import java.util.*;
public class Dec_to_Bin {

    public static void decToBin(int decimal){
        int myNum = decimal;
        int pow = 0;
        int bin = 0;
       while(decimal>0){
        int rem = decimal % 2;

        bin = bin + (rem * (int)Math.pow(10, pow));
        pow++;
        decimal = decimal/2;
    }
    System.out.print("binary of "+ myNum +" = " + bin);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n = sc.nextInt();
        decToBin(n);


    }
}
