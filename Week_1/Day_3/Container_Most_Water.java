class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l=0,r=n-1;
        int curr_area=0,max_area=0;

        while(l<r) {
            curr_area = Math.min(height[l],height[r])*(r-l);
            if(curr_area>max_area) max_area=curr_area;
           

            if(height[l]<height[r]) 
                l++;
            
            else r--;
        }
        return max_area;
        
    }
}