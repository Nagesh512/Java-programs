public class Patterns_Advance {

        public static void hollow_rectangle(int totalRow, int totalCol){
    
            for(int i = 1; i<=totalRow; i++){
    
                for(int j = 1; j<=totalCol; j++){
                    if(i==1 || i== totalRow || j==1 || j==totalCol){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    
        public static void inverted_rotated_half_Pyr(int n){
            for(int i = 1; i<=n; i++){
    
                // space
                for(int j =1; j<= n-i; j++){
                    System.out.print(" ");
                }
                // stars
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    
        public static void inverted_half_pyr_withNo(int n){//my own logic
             for(int i = n; i>=1; i--){
    
                for(int j = 1; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
             }
        }
        public static void invert_half_pyr_withNo(int n){
            for(int i = 1; i<=n; i++){
                for(int j = 1; j <= n-i+1; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    
        public static void floyds_triangle(int n){
            int no = 1;
            for(int i = 1; i <= n; i++){
                for(int j = 1; j<=i; j++){
                    System.out.print(no +" ");
                    no++;
                }
                System.out.println();
            }
        }
    
        public static void zero_one_triangle(int n){
            for(int i=1; i<=n; i++){
    
                for(int j = 1; j<=i; j++){
                    if( (i+j) % 2 == 0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
        }
    
        public static void butterfly(int n){
            for(int i=1; i<=n; i++){
                // star
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                // space
                for(int j=1; j<=2*(n-i); j++){
                    System.out.print(" ");
                }
                // star
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n; i>=1; i--){
                // star
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                // space
                for(int j=1; j<=2*(n-i); j++){
                    System.out.print(" ");
                }
                // star
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
        public static void solid_rhombus(int n){
            for(int i = 1; i<=n; i++){
                for(int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }
                // for(int j=1; j<=5; j++){
                //     System.out.print("*");
                // }
                System.out.println("*****");
            }
        }
    
        public static void hollow_rhombus(int n){
            for(int i = 1; i<=n; i++){
    
                for(int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=n; j++){
    
                    if(i==1 || i==n || j==1 || j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                 
            
                }
                System.out.println();
            }
        }
        
        public static void diamond(int n){
            for(int i = 1; i<=n; i++){
                for(int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=(2*i-1); j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = n; i>=1; i--){
                for(int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=(2*i-1); j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
    
        public static void main(String args[]){
            hollow_rectangle(4, 5);
            inverted_rotated_half_Pyr(4);
            inverted_half_pyr_withNo(5);
            invert_half_pyr_withNo(5);
            floyds_triangle(5);
            zero_one_triangle(5);
            butterfly(4);
            solid_rhombus(5);
            hollow_rhombus(5);
            diamond(3);
        }
        
    }
