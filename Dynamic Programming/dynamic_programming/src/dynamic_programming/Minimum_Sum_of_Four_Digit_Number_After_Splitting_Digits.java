package dynamic_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Minimum_Sum_of_Four_Digit_Number_After_Splitting_Digits {
    
    public static int Combine_number(List<Integer> arr1) {
        String sum_ans = "";
        for(int i=0;i<arr1.size();i++) 
            sum_ans = sum_ans + Integer.toString(arr1.get(i));
        
        return Integer.parseInt(sum_ans);
}
    
    public static void main(String[] args) {
        int num = 2932;
        // List -> Interface ArrayList -> Class
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<Integer>();
        
        while (num>0) {
            list1.add(num % 10);
            num = num/10;
        }
        // Now list1 2392 appears since the list is appending from the last
        Collections.reverse(list1);  // so that 2932 appears
        
        for(int i=1;i<list1.size();i++) {
            int num1 = Combine_number(list1.subList(0, i));
            int num2 = Combine_number(list1.subList(i, list1.size()));
            
            System.out.println("num1 : " + num1);
            System.out.println("num2 : " + num2);
            
            ans.add(num1+num2);
        }
        
        System.out.println(ans);
                  
    }
}
