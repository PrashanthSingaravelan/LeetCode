package dynamic_programming;

public class fibonacci_numbers {
    
    public static int fib(int n) {
        if ((n==0) || (n==1))
            return 1;
        else 
            return fib(n-2) + fib(n-1);
    }
    
    public static void main(String[] args) {
        int n=2;
        System.out.println(fib(n-1));

    }
}