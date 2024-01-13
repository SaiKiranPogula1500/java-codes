Question Link Leet Code :
https://leetcode.com/problems/3sum/description/
Question Description :
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 
Constraints:
3 <= nums.length <= 3000
-105 <= nums[i] <= 105

Solution : 
Time Complexity : O(n^2);
Space Complexity : O(n)
class Solution {
    public List<List<Integer>> threeSum(int[] A) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(A);
        int target= 0;
        for(int i=0;i<A.length;i++)
        {
            if(i>0 && A[i]==A[i-1]) continue;
            int j=i+1;
            int k=A.length-1;
            while(j<k)
            {
                int sum = A[i]+A[j]+A[k];
                if(sum>target)
                {
                    k--;
                }
                if(sum<target)
                {
                    j++;
                }
                else if(sum==target)
                {
                    List<Integer>list=new ArrayList<>();
                    list.add(A[i]);
                    list.add(A[j]);
                    list.add(A[k]);
                    ans.add(list);
                    j++;
                    k--;
                    while(j<k && A[j]==(A[j-1]))
                    {
                        j++;
                    }
                    while(k>=j && A[k]==A[k+1])
                    {
                        k--;
                    }
                }
            } 
        }
         return ans;
    }
}