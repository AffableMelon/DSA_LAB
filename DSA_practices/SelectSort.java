import java.util.Arrays;

class SelectSort{

    public static int[] selectSort(int[] nums){
        for(int i = 0; i < nums.length; i++){
            int min = i;
            for (int j = i+1 ; j <= nums.length-1; j++){
                if (nums[j] < nums[min]){
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        return(nums);
    }
    
    public static void main (String[] args){
        int[] nums = { 3,2,4,1,5};
        System.out.println(Arrays.toString(insert(nums)));
    }
}