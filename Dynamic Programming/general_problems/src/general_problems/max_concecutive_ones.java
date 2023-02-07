package general_problems;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class max_concecutive_ones {
    public static void main(String[] args) {
        int nums[] = new int[]{1,0,1,1,0,1};
        int max_ones = 0;
        
        //int ans[] = new int[0];
        List<Integer> ans = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == 0) {
                //System.out.println(max_ones);
                ans.add(max_ones);
                max_ones     = 0;
            }
            
            else { max_ones+=1; }
            
        }
        ans.add(max_ones);
        
        System.out.println(Collections.max(ans));
        
    }
}
