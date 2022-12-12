package leet_code_strings;

import java.util.ArrayList;
import java.util.List;

public class Count_Items_Matching_a_Rule {
    
    // Adding elements in Nested list
    public static List<List<String>> input_elements(List<List<String>> parent, String arr[]) {
        List<String> child = new ArrayList<>();
        for (String var1:arr) 
            child.add(var1);
        parent.add(child);
        return parent;
    }
    
    public static void main (String args[]) {
        String arr1[] = { "phone",   "blue",   "pixel" };
        String arr2[] = { "computer","silver", "lenovo" };
        String arr3[] = { "phone",   "gold",   "iphone"};
        
        List<List<String>> parent = new ArrayList<>();
        parent = input_elements(parent, arr1);
        parent = input_elements(parent, arr2);
        parent = input_elements(parent, arr3);
        
        // type | color | name
        String ruleKey   = "color";
        String ruleValue = "silver";
        
        int ans   = 0;
        int index = 1;
        
        //System.out.println(parent.size());
        
        int i=0;
        while (i < parent.size()) {
            List<String> temp_str = parent.get(i);  // taking list by list
                if (temp_str.contains("phone")) 
                    ans+=1;
                i+=1;
            }
        
        System.out.println(ans);
        
        }  
}
