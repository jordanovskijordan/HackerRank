public class Diagonal Difference {

	public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        Scanner q = new Scanner(System.in);
        int z=1;
        int x=1;
        int n=b.nextInt();
        int[][] matrica = new int[100][100];
        int i;
        int j;
        for(i=0;i<n;i++)
        {	
        	for(j=0;j<n;j++)
        	{
        		String c=q.next();
        		matrica[i][j]=(Integer.parseInt(c));
        	}
        }
        for(i=0;i<n;i++)
        {
        	z*=matrica[i][i];
        }
        for(i=0;i<n;i++)
        {
        	x*=matrica[i][n-i-1];
        }
        System.out.println(Math.abs(z-x));
        }
	
     }

/*
Problem Statement:
You are given a square matrix of size N×N.
Calculate the absolute difference of the sums across the two main diagonals.

Input Format:
The first line contains a single integer N.
The next N lines contain N integers (each) describing the matrix.

Constraints:
1 ≤ N ≤ 100 
−100 ≤ A[i] ≤ 100

Output Format:
Output a single integer equal to the absolute difference in the sums across the diagonals.

Example:

Intput:
3
11 2 4
4 5 6
10 8 -12

Output:
15
*/