public class Extra Long Factorials {

	 public static BigInteger factorial(BigInteger n) {
		 
	     if (n.intValue()==0)
	     {
	    	 return BigInteger.ONE;
	     }
	     else
	     {
	    	 return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	     }
	   }
   public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
       BigInteger n = a.nextBigInteger();
       System.out.println(factorial(n));
   }
}

/*
Problem Statement:
You are given an integer N. Print the factorial of this number.

N!=N×(N−1)×(N−2)×⋯×3×2×1
Note: Factorials of N>20 can't be stored even in a 64−bit long long variable.
Big integers must be used for such calculations.
Languages like Java, Python, Ruby etc. can handle big integers
but we need to write additional code in C/C++ to handle such large values.

We recommend solving this challenge using BigIntegers.

Input Format :
Input consists of a single integer N.

Constraints: 
1 ≤ N ≤ 100

Output Format :
Output the factorial of N.

Example:

Sample Input:
25

Sample Output:
15511210043330985984000000
*/