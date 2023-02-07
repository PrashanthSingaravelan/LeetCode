package binary_search_problems;

import java.util.Arrays;

public class longest_subsequence_limited_sum_bruteforceapproach {
    public static void main(String[] args) {
        int nums[]    = new int[] {2,3,4,5};
        int queries[] = new int[] {1};
        Arrays.sort(nums);
        
        int cnt = 0;
        int ans[] = new int[queries.length];
        Arrays.fill(ans, 0);
        
        for(int i=0;i<nums.length;i++) {
            
            int query_index   = 0;
            int nums_sum_arr[] = (Arrays.copyOfRange(nums, 0, i+1));
            int nums_sum       = Arrays.stream(nums_sum_arr).sum();
            cnt+=1;
            
            while(query_index<queries.length ) {
                
               // System.out.println("\nNUM SUM : " + nums_sum);
                //System.out.println("queries[query_index] : " + queries[query_index]);
                
                if (nums_sum <= queries[query_index]) {
                    ans[query_index] = cnt;
                    //System.out.println("FINAL : " + cnt);
                }
                query_index+=1;
            }
        } 
        
        for(int element:ans) {
            System.out.println(element);
        }
            
    }
}
