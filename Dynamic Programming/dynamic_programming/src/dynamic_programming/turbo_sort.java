package dynamic_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class turbo_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int t      = sc.nextInt();
        int[] a    = {3,3,6,7,1};
        
        // Array -> ArrayList
        List<Integer> arr1 = new ArrayList(a.length);
        for(int element:a) { arr1.add(element); }
        
        // ArrayList -> Set -> ArrayList
        Set set = new LinkedHashSet<>();
        set.addAll(arr1);  // removing the duplicate elements
        arr1.clear();      // removing the already present elements
        arr1.addAll(set);  // set to ArrayList
        Collections.sort(arr1);
            
        for(int i:a) {
            System.out.println(i);
        }
        
    }  
}
