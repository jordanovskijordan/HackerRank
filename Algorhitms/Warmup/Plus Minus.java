public class Plus Minus {

	public static void main(String[] args) {
        b = new Scanner(System.in);
        q = new Scanner(System.in);
        float z=0;
        float x=0;
        float y=0;
        float n=b.nextInt();
        for(int i=0;i<n;i++)
        {	
        	String c=q.next();
        	if((Float.parseFloat(c)>0))
        		{
                    x++;
                }
        	else if((Float.parseFloat(c)<0))
        		{
                     y++;
                }
        	else
				{
                    z++;
                }
     }
        System.out.println(x/n);
        System.out.println(y/n);
        System.out.println(z/n);
	}
}


/*
Problem Statement:
You're given an array containing integer values.
You need to print the fraction of count of positive numbers,
negative numbers and zeroes to the total numbers.
Print the value of the fractions correct to 3 decimal places.

Input Format:
First line contains N, which is the size of the array. 
Next line contains N integers A1,A2,A3,...,AN, separated by space.

Constraints: 
1 ≤ N ≤ 100 
−100 ≤Ai ≤ 100

Output Format:
Output three values on different lines equal to the fraction of count of positive numbers,
negative numbers and zeroes to the total numbers respectively correct to 3 decimal places.

Example:

Input:
6
-4 3 -9 0 4 1

Output:
0.500
0.333
0.167
*/