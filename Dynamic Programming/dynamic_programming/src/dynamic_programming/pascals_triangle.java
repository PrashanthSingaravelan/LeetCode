package dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class pascals_triangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> list1 = new ArrayList<>();
        
        for (int i=0;i<numRows;i++) {
            List<Integer> temp_list = new ArrayList<>();
            List<Integer> temp_list1 = new ArrayList<>();
            temp_list.clear();
            for(int j=0;j<=i;j++) {
                temp_list.add(1); 
                temp_list1.add(1);
            }
            
            for(int k=0;k<i;k++) {
                int sum1 = temp_list.get(k);
                int sum2 = temp_list.get(k+1);
                int final_sum = sum1 + sum2;
                temp_list1.add(i, final_sum);
            }
            
            list1.add(temp_list1);
        }
           
        System.out.println(list1);
   }
}   
            
//            if ((i==0) || (numRows == 1)) {
//                List<Integer> temp_list = new ArrayList<>();
//                temp_list.add(1);
//                list1.add(temp_list);
//            }
//            
//            else if ((i==1) || (numRows == 2)) {
//                List<Integer> temp_list = new ArrayList<>();
//                temp_list.add(1);
//                temp_list.add(1);
//                list1.add(temp_list);
//            }
//            
//            else { 
//                List<Integer> temp_list = new ArrayList<>();
//                temp_list.add(1);
         
