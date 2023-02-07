package dynamic_programming;

public class divisor_game {
    public static void main(String[] args) {
        int n=4;
        int alice = 0;
        int bob   = 0;
        
        int count = 0;
        
        for(int i=1;i<n;i++) {
            
            if (n>1) {
                alice+=1;
                n-=1;
                count = n;
                
                if (>1)   {                                                                                                                                                                                                                                                                                                                                             
                  bob+=1;
                  n-=1;
                }
            }
        }
        
        System.out.println(alice);
        System.out.println(bob);
        
    }
}
