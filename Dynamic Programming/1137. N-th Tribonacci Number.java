class Solution {

    public int tribonacci(int n) {

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
                arr1.add(i,ans);
            }
            return ans;
        }
    }
}