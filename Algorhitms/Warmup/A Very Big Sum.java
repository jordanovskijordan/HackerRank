public class A Very Big Sum {
    
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        Scanner q=new Scanner(System.in);
        long z=0;
        long n=b.nextLong();
        for(int i=1;i<=n;i++)
        {
            String c=q.next();
            z+=(Long.parseLong(c));
        }
        System.out.println(z);
        }
}

/*
Problem Statement:
You are given an array of integers of size N.
You need to print the sum of the elements of the array.

Note:
The range of the 32-bit integer is −2^31 to 2^31−1 or [−2147483648,2147483647].
When we add several integer values, the resulting sum might exceed this range.
You might need to use long long int in C/C++ or long data type in Java to store such sums.

Input Format:
The first line of the input consists of an integer N.
The next line contains N space-separated integers describing the array.

Constraints:
1 ≤ N ≤ 10 
0 ≤ A[i] ≤ 10^10

Output Format:
Output a single value equal to the sum of the elements of the array.

Example:

Input:
5
1000000001 1000000002 1000000003 1000000004 1000000005

Output:
5000000015
*/