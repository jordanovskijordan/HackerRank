public class Library Fine {
	
	public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        int[] x=new int[3];
        int[] y=new int[3];
        for(int i=0;i<3;i++)
        {
        	String D=a.next();
        	x[i]=(Integer.parseInt(D));
        }
        for(int j=0;j<3;j++)
        {
        	String M=b.next();
        	y[j]=(Integer.parseInt(M));
        }
        if(x[0]!=y[0])
        {
        	System.out.println((x[0]-y[0])*15);
        }
        else if(x[1]!=y[1])
        {
        	System.out.println((x[0]-y[0])*500);
        }
        else if(x[2]!=y[2])
        {
        	System.out.println((x[0]-y[0])*10000);
        }
        else
        {
        	System.out.println(0);
        }
	}
}

/*
Problem Statement:
The Head Librarian at a library wants you to make a program
that calculates the fine for returning the book after the return date.
You are given the actual and the expected return dates. Calculate the fine as follows:

If the book is returned on or before the expected return date,
no fine will be charged, in other words fine is 0.

If the book is returned in the same month as the expected return date,
Fine = 15 Hackos × Number of late days

If the book is not returned in the same month but in the same year as the expected return date,
Fine = 500 Hackos × Number of late months

If the book is not returned in the same year, the fine is fixed at 10000 Hackos.

Input Format:
You are given the actual and the expected return dates in D M Y format respectively.
There are two lines of input.
The first line contains the D M Y values for the actual return date
and the next line contains the D M Y values for the expected return date.

Constraints:
1 ≤ D ≤ 31 
1 ≤ M ≤ 12 
1 ≤ Y ≤ 3000

Output Format:
Output a single value equal to the fine.

Example:

Input:
9 6 2015
6 6 2015

Output:
45
*/