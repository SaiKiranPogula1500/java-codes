/* 
Question link :
https://leetcode.com/problems/container-with-most-water/description/
Question description :
You are given an integer array height of length n. There are n vertical 
lines drawn such that the two endpoints of the ith line are (i, 0) and 
(i, height[i]).

Find two lines that together with the x-axis form a container, such 
that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented 
by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of 
water the container can contain is 49.

Solution : 
*/
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