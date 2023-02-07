package general_problems;

import java.util.Arrays;

public class findKRotation {
    
    public static int rotation(int arr[]) {
        int sorted_arr[] = new int[]{};
        sorted_arr       = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted_arr);
        int rotation = 1;
        
//        for(int i:arr)        System.out.print(i);
//        System.out.println("\n");
//        for(int i:sorted_arr)        System.out.print(i);
        
        for(int i=arr.length-1;i>=0;i--) {
            //System.out.println(sorted_arr[i]);
            //System.out.println(arr[i]);
            if (sorted_arr[i] == arr[0])
                return rotation;
            
            else if (sorted_arr[0] == arr[0])
                return 0;
            
            else
                rotation+=1;
        }
        
        return rotation;
    }
    
    public static void main(String[] args) {
        int arr[]        = new int[] {5,1,2,3,4};
        
        System.out.println( rotation(arr));
        //int ans = rotation(arr);
    }
}
