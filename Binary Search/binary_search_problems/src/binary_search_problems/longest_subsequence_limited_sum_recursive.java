package binary_search_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class longest_subsequence_limited_sum_recursive {
    
    static int prefix[];
    
    static void prefix_array(int arr1[]) {
        prefix[0] = arr1[0];
        // Adding present element with previous element
        for (int i = 1; i < arr1.length; i++)
            prefix[i] = prefix[i - 1] + arr1[i];
    }
    
    static int binary_search(int low, int high, int element) {
        int middle = (low + high) / 2;
        
        if (low<=high) {

            if (element == prefix[middle])
                return element;

            else if (element <= prefix[middle])
                return binary_search(low, middle - 1, element);

            else if (element >= prefix[middle])
                return binary_search(middle+1, high, element);
        }
        
        return prefix[middle];
    }
    
    public static void main(String[] args) {
        int nums[]    = new int[] {2,3,4,5};
        int queries[] = new int[] {1};
        Arrays.sort(nums);
        
        prefix         = new int[nums.length];
        prefix_array(nums);
        int element_ans[]     = new int[queries.length];
        
        for(int query_index=0; query_index<queries.length; query_index++)   {
            int element = binary_search(0,prefix.length -1, queries[query_index]);
            element_ans[query_index] = element;
        }
        
        List<Integer> list1 = new ArrayList<>();
        for(int i:prefix) 
            list1.add(i);
        
       for(int j:element_ans) 
           System.out.println(j);
        
//        int index_ans[]     = new int[queries.length];
//        if (element_ans.length == 1)
//            index_ans[0] = list1.indexOf(element_ans[0]);
//        else {
//             for(int i=0; i<element_ans.length; i++) 
//                 index_ans[i] = list1.indexOf(element_ans[i]) + 1;
//        }
//        
//        for(int j:index_ans) 
//            System.out.println(j);
    }
}
