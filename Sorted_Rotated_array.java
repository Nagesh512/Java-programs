public class Sorted_Rotated_array {
    
    public static int minSearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public int search(int[] nums, int target ) {
        // min will have index of minimum element of nums 
        int min = minSearch(nums);
        // find in sorted left
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return search(nums, min, nums.length - 1, target);
        }
        // find in sorted right else{
        return search(nums, 0, min, target);
    }

    public static int search(int[] nums,int left,int right,int target){
        int l = left; int r = right;
        // System.out.println(left+" "+right); while(l <= r){
        int mid = l + (r - l)/2; if(nums[mid] == target){
          return mid;
        }
        else if(nums[mid] > target){ r = mid-1;
        }
        else{
        l = mid+1;
        }
        return -1;
        }

        public static void main(String args[]) {
            int nums[] = { 4, 5, 6, 7, 9, 1, 2 };
            // int nums[] = {5, 4, 3, 9, 8, 7, 6 };
            int target = 6;
            int index = search(nums, 0, 0,target );
            
            if(index == -1){
                System.out.println("Entered no. is not present in array");
            }
            else{
                System.out.println("Entered no. is present at index " + index );
    
            }
        }
}
