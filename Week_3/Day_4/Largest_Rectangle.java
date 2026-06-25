class Solution {
    public int largestRectangleArea(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int maxArea=0,n=nums.length;
        int nse[]=new int[n];
        int pse[]=new int[n];

        // Finding pse

        for(int i=0;i<n;i++) {

            while(st.size()>0 && nums[i]<=nums[st.peek()]) {
                st.pop();            
            }
             pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();

        // Finding nse

        for(int i=n-1;i>=0;i--) {

            while(st.size()>0 && nums[i]<=nums[st.peek()]) {
                st.pop();
            }
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }

        for(int i=0;i<n;i++) {
            int area=(nse[i]-pse[i]-1)*nums[i];
            maxArea=Math.max(area,maxArea);
        }
        return maxArea;
        
    }
}