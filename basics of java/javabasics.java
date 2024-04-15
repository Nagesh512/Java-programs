import java.util.*;
public class javabasics {

    public static void main(String args[]){  
       
       System.out.println("Hello World"); 
       
       // Code to calculate sum
       int a=10;
       int b = 5;
       int sum = a+b;
       System.out.println(a);  
       System.out.println(b);  
       System.out.println(sum);  
       
       String name ="Nagesh Salunke";
       System.out.println(name);  
       
       a=50;
       System.out.println(a);  
  
       // INPUT IN JAVA  
       Scanner sc = new Scanner(System.in);
    /* String input = sc.next();
       System.out.println(input); 
       
       String Name = sc.nextLine();
       System.out.println(Name);
       
       int Number = sc.nextInt();
       System.out.println(Number);
       
       float price = sc.nextFloat();
       System.out.println(price);
       
      //  SUM OF A & B BY USING INPUT
      //  Scanner sc = new Scanner(System.in);   -----defined upper
      int c = sc.nextInt();
      int d = sc.nextInt();
      int sum2 = c + d;
      System.out.println(sum2);  */
  
      //  PRODUCT OF 2 NO.
      System.out.println("Enter two numbers for multiplication");
      int e = sc.nextInt();
      int f = sc.nextInt();
      int product = e * f;
      System.out.println("Product is "+product);
      
      //  AREA OF CIRCLE45
      System.out.println("Enter the radius of circle to calculate area");
      float radius = sc.nextFloat();
      float area = 3.14f*radius*radius;
      System.out.println("Area of cirle is " +area);
  
      //  TYPE CASTING
      float z = 22.5f;
      int y = (int) z;
      System.out.println("value of Y after typecasting "+y);
      
      //  Alphabet substraction 
      char s = 's';
      char r = 'r';
      System.out.println("Substraction of alphabet " +(s-r));

      // sum of 3 objects with 18% GSt
      System.out.println("Enter three numbers to find total price with 18% GST");
      float m = sc.nextFloat();
      float n = sc.nextFloat();
      float q = sc.nextFloat();
      float total = (m+n+q);
      float total_GST = total+(total*18/100);
      System.out.println(total_GST);
    }   
}
