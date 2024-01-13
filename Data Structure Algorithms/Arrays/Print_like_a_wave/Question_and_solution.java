/*
 Write a program to input an integer N and a N*N matrix Mat from user and print the matrix in wave form (column wise)
 See example for clarifications regarding wave print.

Output Format
A single line containing N*N integers of matrix Mat in wave form (column wise)

Example Input
1 2 3
4 5 6
6 7 8
 */
package Arrays.Print_like_a_wave; 

 public class Question_and_solution {
	public static int[] wavePrint(int arr[][], int N, int M) {
		int []A = new int[N*M];
		int index = 0;
        for(int col=0;col<M;col++)
        {
            if(col%2==0)
            {
                for(int row=0;row<N;row++)
                {
                   A[index] = arr[row][col];
				   index++;
                }
            }else {
                  for(int row =N-1;row>=0;row--)
                 {
                    A[index] = arr[row][col];
				    index++;
                 }
            }
         }
		 return A;
	}
}


