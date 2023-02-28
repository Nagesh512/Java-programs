public class Count_Sort {
    
    public static void countSort(int arr1[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr1.length; i++){
            largest = Math.max(largest, arr1[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr1.length; i++){
            count[arr1[i]]++;
        }

        // sort
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr1[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void display(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int array[]={2, 4, 8, 1, 5, 9, 3};
        countSort(array);
        display(array);
    }
}
