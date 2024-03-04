/*
 Question link geeks for geeks.
 https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

 Question description

 Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is a leader if 
 it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

Example 1:

Input:
n = 6
arr[] = {16,17,4,3,5,2}
Output: 17 5 2
 */
import java.util.*;
 class Solution{
   
    static ArrayList<Integer> leaders(int arr[], int n){
   
        int max = arr[n-1];
        ArrayList<Integer>list = new ArrayList<>();
        list.add(max);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                max = arr[i];
                list.add(max);
            }
        }
       Collections.reverse(list); 
       return list;
    }
}

