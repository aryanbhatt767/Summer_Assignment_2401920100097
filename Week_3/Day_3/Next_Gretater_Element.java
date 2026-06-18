class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int ans[] = new int[n];

        for(int i=0;i<n;i++) {
            ans[i] = search(nums1[i],nums2);
        }

        return ans;
        
    }

    int search(int x,int nums2[]) {

        for(int i=0;i<nums2.length-1;i++) {

            if(nums2[i] == x) {
                for(int j=i+1;j<nums2.length;j++) {
                    if(nums2[j]>nums2[i])
                    return nums2[j];
                }
                return -1;
            }


        }
          return -1;
    }
  

   
}