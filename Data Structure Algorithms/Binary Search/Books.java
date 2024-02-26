/*
 question link : interview bit
 https://www.interviewbit.com/problems/allocate-books/

 Given an array of integers A of size N and an integer B.

The College library has N books. The ith book has A[i] number of pages.

You have to allocate books to B number of students so that the maximum number of pages allocated to a student is minimum.

A book will be allocated to exactly one student.
Each student has to be allocated at least one book.
Allotment should be in contiguous order, for example: A student cannot be allocated book 1 and book 3, skipping book 2.
Calculate and return that minimum possible number.

NOTE: Return -1 if a valid assignment is not possible.

    input 1:
    A = [12, 34, 67, 90]
    B = 2
    Input 2:
    A = [5, 17, 100, 11]
    B = 4
 */

public class Books {
    int n;
    public boolean check_pages(int []A, int B, int average_pages)
    {
        int no_of_pages = 0;
        int no_of_students = 1;
        for(int i=0;i<n;i++)
        {
            no_of_pages = no_of_pages+A[i];
            if(no_of_pages>average_pages)
            {
                no_of_students++;
                no_of_pages = A[i];
            }
        }
        if(no_of_students>B)
        {
            return false;
        }
        return true;
    }
    public int books(int[] A, int B) {
        n= A.length;
        if(B>n)
        {`
            return -1;
        }
        int low = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            low = Math.max(low,A[i]);
        }
        int high = 0;
        for(int i=0;i<n;i++)
        {
            high = high+A[i];
        }
        int ans = high;
        while(low<=high)
        {
            int average_pages = (low+high)/2;
            if(check_pages(A, B, average_pages))
            {
                ans = average_pages;
                high = average_pages-1;
            }else{
                low = average_pages+1;
            }
        }
        return ans;
    }
}
