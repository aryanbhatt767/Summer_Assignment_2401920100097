class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;

        Deque<Integer> q=new ArrayDeque<>();

        int ans[]=new int[n-k+1];//total window 
        for(int i=0;i<n;i++) {

             while(q.size()>0 && q.peekFirst()<i-k+1)
             q.pollFirst();

             while(q.size()>0 && nums[i]>nums[q.peekLast()])
             q.pollLast();

             q.offer(i);
             if(i>=k-1) {
                ans[i-k+1]=nums[q.peekFirst()];

             }


        }
        return ans;
       


         
    }
}