package general_problems;

import java.util.Arrays;

public class missing_numbers {
    public static int i;
    public static void main(String[] args) {
        int nums[] = new int[]{9,6,4,2,3,5,7,0,1};
    
        Arrays.sort(nums);
        try {
            for(i=0;i<=nums.length;i++) {
                if (nums[i]!=i) { break; }
                return i;
            }   
        }
        
        catch (Exception e) { return i;}    
    }
}
