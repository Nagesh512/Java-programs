public class max_subarray_byKadens3 {
    
    public static void kadens(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int maxelement = Integer.MIN_VALUE;
        for(int i= 0; i<numbers.length; i++){

            maxelement = Math.max(maxelement, numbers[i]);
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }      
        if(ms == 0){
            ms = maxelement;
        }      
        System.out.println("Max sum of subarray is "+ ms);            
    }

    public static void main(String args[]) {
        int numbers[] = { 2, -4, 5, -1, 7 };
        kadens(numbers);
    }
}
