class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int Max_Area = 0;
        int p1 = 0;
        int p2 = n-1;
        for(int i=0;i<n;i++)
        {
            int length = Math.abs(p1-p2);
            int breadth = Math.min(height[p1],height[p2]);
            int Current_Area = length*breadth;
            Max_Area = Math.max(Max_Area,Current_Area);

            if(height[p1]<height[p2]) p1++;
            else p2--;
        }
        return Max_Area;
    }
}