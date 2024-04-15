import java.util.*;
public class if_else {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

    int age = sc.nextInt();
    if ( age>= 18){
        System.out.println("Adult : drive, vote");
    }
    else if(age >= 13 && age <= 18){
        System.out.println("Teenager");
    }
    else{
        System.out.println("not adult");
    }

    // Find largest
    int a = 1, b = 5;
    if(a>b){
        System.out.println("a is largest ");
    }
    else{
        System.out.println("b is largest ");
    }
    }
}
