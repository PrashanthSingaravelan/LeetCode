package binary_search_problems;

public class max_pos_neg {
    
    static int binary_iterative(int arr1[]) {
    
    int low    = 0;
    int high   = arr1.length - 1;    
        
    while (low <= high) {
        int middle = (int) Math.ceil((low + high) / 2);
        
        if ((arr1[middle]) < 0)  
            low = middle + 1;
        
        else if ((arr1[middle]) > 0)   
            high = middle - 1;
    }
    
    if (low<high) 
        return arr1.length-low;
    else if (low>high) 
        return low;
    else 
        return low;
}
    
    public static void main(String[] args) {
        
        int arr1[] = new int[] {5,20,66,1314};
        System.out.println(binary_iterative(arr1));
    }
}
