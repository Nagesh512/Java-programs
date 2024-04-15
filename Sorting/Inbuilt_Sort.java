import java.util.Arrays;   //package for inbuilt sorting in java
import java.util.Collections;    //package for inbuilt descending order sorting
public class Inbuilt_Sort {
    
    public static void display(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void Display(Integer array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }



    public static void main(String args[]){
        int array[] = {2,7,9,0,4,3,8};
        // Arrays.sort(array);    //Ascending order only
        Arrays.sort(array, 1, 4); //(array, start index, end index) 
        // it will sort the numbers from start index to the end index-1
        display(array);
        System.out.println();

        // for descending order array we need Integer variable
        Integer arr1[] = {0, 9, 5, 4, 2, 8, 1, 7, 3};

        // Arrays.sort(arr1, Collections.reverseOrder());
        Arrays.sort(arr1, 2, 5,  Collections.reverseOrder());
        // (array, start index, end index, Collections.reverseOrder())
        Display(arr1);
        

    }
}
