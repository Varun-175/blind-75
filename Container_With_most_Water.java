class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left<right)
        {
            int width = right-left;
            int currentHeight = Math.min(height[left] , height[right]);

            int area = currentHeight * width;

            //update the max area

            maxArea = Math.max(area , maxArea);

            if(height[left]  < height[right])
            {
                left++; }
                else{
                    right--;
                }
            
        }
                    return maxArea;

    }
}