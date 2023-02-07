package dynamic_programming;

import java.util.Scanner;

public class lucky_four {
    
    public static int number_of_fours(int num) {
        int ans = 0;
        while (num > 0) {
            if (num % 10 == 4) 
                ans+=1; 
            num = num / 10;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n     = sc.nextInt();
        int a[]   = new int[n];
        int ans[] = new int[n];
        
        for(int i=0;i<n;i++)
            a[i]   = sc.nextInt();
            
        for(int i=0;i<n;i++)  
            ans[i] = number_of_fours(a[i]); 
        
        for(int j=0;j<n;j++)  
            System.out.println(ans[j]); 
    }
    
}
