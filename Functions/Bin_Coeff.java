public class Bin_Coeff {
    
    public static int fact(int n){  //In this program fact use as helper function 
        int f = 1;

        for(int i = 1; i<=n; i++){
            f = f * i;
        }
        return f;
    }

    public static int Bin_Coeff(int n, int r){
        int fact_n = fact(n);        //Fact used as helper function
        int fact_r = fact(r);
        int fact_n_m_r = fact(n-r);

        return  fact_n/(fact_r * fact_n_m_r);
    }
    
    public static void main(String args[]){

        System.out.println(Bin_Coeff(10,2));
    }
}
