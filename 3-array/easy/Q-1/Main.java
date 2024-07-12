import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(getAns(nums)));
    }
    static int[] getAns(int nums[]){
        
        for(int i=0;i<nums.length;i++){
            nums[i] = nums.length * (nums[nums[i]]%nums.length)+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]/nums.length;
        }
        return nums;
    }
}