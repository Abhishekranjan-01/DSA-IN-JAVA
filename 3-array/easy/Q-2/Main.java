import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums = {1,3,2,1};
        System.out.println(Arrays.toString(concatenate(nums)));
    }

    static int[] concatenate(int[] nums){

        int [] ans = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[nums.length+i] = nums[i];
        }
        return ans;
    }
    
}