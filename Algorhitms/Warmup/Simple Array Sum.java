public class Simple Array Sum {

    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        Scanner q=new Scanner(System.in);
        int z=0;
        int n=b.nextInt();
        for(int i=1;i<=n;i++)
        {
        	String c=q.next();
        	z+=(Integer.parseInt(c));
        }
        System.out.println(z);
    	}
}


/*
Problem Statement:
You are given an array of integers of size N. You need to print the sum of the elements of the array.

Input Format :
The first line of the input consists of an integer N.
The next line contains N space-separated integers describing the array.

Constraints:
1 ≤ N ≤ 1000 
0 ≤ A[i] ≤ 1000

Output Format:
Output a single value equal to the sum of the elements of the array.

Example:

Input:
6
1 2 3 4 10 11

Output:
31
*/