public class Subarray_and_maxsub {

    public static void Subarray(int numbers[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];
                    if (maxSum < sum) {
                        maxSum = sum;
                    }
                }
                ts++;
                // System.out.println("sum = " + sum);
            }
        }
        System.out.println("Max sum is " + maxSum);
        System.out.println("total no. of pairs = " + ts);
        // No. of Subarrays = n(n+1)/2 where n = Array length
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 5, 7, 8, 9 };
        Subarray(numbers);
    }
}
