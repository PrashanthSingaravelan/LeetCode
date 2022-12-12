package matrix_operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;  
import java.util.Set;

public class K_Weakest_Rows_in_Matrix {
    public static void main(String[] args) {
        int[][] mat = new int[][] { {1,1,0,0,0}, {1,1,1,1,0} , {1,0,0,0,0}, {1,1,0,0,0}, {1,1,1,1,1} };
        int k       = 3;
        
        int[] initial_ans            = new int[mat[0].length];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        // rows
        for(int i=0; i<mat.length; i++) {        
            int cnt = 0;
            
            // columns
            for(int j=0; j<mat[0].length; j++) 
                // number-1
                if (mat[i][j] == 1) cnt+=1; 
            hm.put(i, cnt);
        }
        
        // hashmap to set
        Set<Entry<Integer, Integer>> entryset = hm.entrySet();    
        
        // set to list
        List<Entry<Integer, Integer>> list    = new ArrayList<>(entryset);
        
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
        @Override
        public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
              return o1.getValue().compareTo(o2.getValue());
            }
        });
       System.out.println(hm);
        
        for(Entry<Integer, Integer> i:list) {
            System.out.println(i.getKey());
        }
        
        //System.out.println(list);
        //System.out.println(hm);
    } 
}    

   

        
//        System.out.println(hm);
        
//        for(int i=0;i<initial_ans.length;i++) {
//            for(int j=i+1; j<initial_ans.length;j++) {
//                if (initial_ans[i] > initial_ans[j])   {
//                    int temp = initial_ans[i];
//                    initial_ans[i]   = initial_ans[j];
//                    initial_ans[j]   = temp;
//                }
//            }
//        }
        
//        int[] final_ans = new int[k];
//        System.arraycopy(initial_ans, 0, final_ans, 0, k);
        
