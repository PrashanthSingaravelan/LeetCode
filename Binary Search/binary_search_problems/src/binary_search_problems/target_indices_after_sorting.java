package binary_search_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class target_indices_after_sorting {
    
    static List<Integer> targetIndices(int[] nums, int target) {
    Arrays.sort(nums);
    List<Integer> list1 = new ArrayList<Integer>();
    for(int i=0;i<nums.length;i++)  {
        if(nums[i] == target) 
            list1.add(i);
        }
        return list1;
    }
    
    public static void main(String[] args) {
        
    }
}
