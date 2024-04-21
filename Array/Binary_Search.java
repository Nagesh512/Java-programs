public class Binary_Search {
    
    public static int BinSearch(int numbers[], int key){
        int start = 0, end = numbers.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(numbers[mid] == key){
                return mid;
            } 
            if(numbers[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
        }

        public static void main(String args[]){

            int numbers[] = {2, 5 , 6 , 7, 10, 12, 15};
            int key = 15;

            if(BinSearch(numbers, key) == -1){
                System.out.println("There is no such key");
            }
            else{
                System.out.println("key present at index no. " + BinSearch(numbers, key));
            }
    
        }
}
