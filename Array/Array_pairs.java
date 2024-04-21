public class Array_pairs {
    public static void array_pairs(int numbers[]){
        int tp=0;
        for(int i = 0; i<numbers.length; i++){
            int curr = numbers[i] ;
            for(int j= i+1; j<numbers.length; j++){
                System.out.print("(" +curr+"," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total no. of pairs = "+ tp); 
        // No. of array pairs = n(n-1)/2   where n = Array length
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 5, 7, 8, 9};
        array_pairs(numbers);
    }
}
