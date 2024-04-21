public class Largest_in_array {
    
    public static void GetLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is "+ smallest);
        System.out.println("Largest value is "+ largest);
        
    }

    public static void main(String args[]){

        int numbers[] = {2,5,6,7,4,9};
        GetLargest(numbers);

    }
}
