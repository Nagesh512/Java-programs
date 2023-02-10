import java.util.Scanner;
public class Bin_to_Dec {

    public static void BinToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int dec = 0;

        while(binNum>0){
            int LastD = binNum % 10;
            dec = dec +(LastD * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }

        System.out.println("decimal of " + myNum +" = " + dec );
    }

    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary number");
        int n = sc.nextInt();
        BinToDec(n);

    }
}
