public class Linear_Search {
    
    public static int LinearSearch(int numbers[], int key){
        
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }            
        }
        return -1;
    }

    public static void main(String args[]){

        int numbers[] = {2,5,6,7,4,9};
        int key = 9;
        // System.out.println(LinearSearch(numbers, key));
        if(LinearSearch(numbers, key) == -1){
            System.out.println("There is no such key");
        }
        else{
            System.out.println("key present at index no. " + LinearSearch(numbers, key));
        }

    }
}
