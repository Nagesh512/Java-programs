public class max_subarray_byPrefix2 {
    
    public static void maxSubarray_prefix(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // Calculate prefix array
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                int curSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                System.out.println("sum " +curSum);
                
                if(maxSum < curSum){
                    maxSum = curSum;
                }
                
            }
        }
        System.out.println("Max sum is "+ maxSum); 
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 5, 7, 8, 9 };
        maxSubarray_prefix(numbers);
    }
}
