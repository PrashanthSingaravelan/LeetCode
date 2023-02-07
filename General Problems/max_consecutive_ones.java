class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_ones = 0;
        List<Integer> ans = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++)  {
            if (nums[i] == 0)       {
                ans.add(max_ones);
                max_ones     = 0;
            }
            
            else { max_ones+=1; }
            
        }
        ans.add(max_ones);

        return Collections.max(ans);
    }
}