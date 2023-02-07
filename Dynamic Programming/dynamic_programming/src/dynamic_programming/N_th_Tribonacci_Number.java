package dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class N_th_Tribonacci_Number {
    
    public static int fib(int n) {
        int cnt = 0;
        
        if (n==0)
            return 0;
        
        else if (n==1 || n==2) 
            return 1;
        
        else {
            List<Integer> arr1 = new ArrayList<Integer>();
            arr1.add(0); arr1.add(1);arr1.add(1);
            int ans = arr1.get(0) + arr1.get(1) + arr1.get(2);
            arr1.add(ans);

                for(int i=3; i<=n;i++) {
                    ans = arr1.get(i-1) + arr1.get(i-2) + arr1.get(i-3);
                    arr1.add(ans);
                    System.out.println(i-3 + " --> " + arr1.get(i-3));
                    System.out.println(i-2 + " --> " + arr1.get(i-2));
                    System.out.println(i-1 + " --> "+ arr1.get(i-1));
                    System.out.println("fib" + "(" + i + ") --> " + arr1.get(i));
                    
                }
            return ans;
        }
    }
    
    public static void main(String[] args) {
        int ans = fib(10);
        System.out.println(ans);
    }
}
