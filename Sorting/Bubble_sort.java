import java.util.*;
public class Bubble_sort {
    
    public static void BubbleSort(int arr[]){
        int swap = 0;
        for(int turn = 0; turn<arr.length - 1; turn++){
            for(int j=0; j<arr.length -1-turn; j++){
                if(arr[j]> arr[j+1]){        //for ascending order
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
          }
          System.out.println("Total Swapped numbers "+swap);

    }

    public static void display(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String args[]){
        int array[] = {4, 3, 6, 2, 8, 9};
        BubbleSort(array);
        display(array);
    }
}
