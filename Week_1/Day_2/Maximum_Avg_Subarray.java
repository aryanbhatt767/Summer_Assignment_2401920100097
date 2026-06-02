class Solution {
    public double findMaxAverage(int[] nums, int k) {


        int n  = nums.length; 
        double sum = 0.0;

        for(int i=0;i<k;i++) {
            sum = sum +  nums[i];
        }
       double maxi = sum;

        for(int i=k;i<n;i++) {

            sum =  sum+nums[i] - nums[i-k];

            if(sum > maxi) maxi =sum;

        }
       
        return maxi/k;
    }
}