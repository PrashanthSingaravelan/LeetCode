package dynamic_programming;

public class practice {
    public static void main(String[] args) {
        int ans      = 0;
        int quotient  = 0;
        int remainder = 0;
        int num = 474;
        
        while (num > 0) {
            if (num % 10 == 4) 
                ans+=1; 
            num = num / 10;
        }
        
        System.out.println(ans);
    }
}
