public class Maximizing XOR {

    static int maxXOR(int l, int r) {
        int max = 0;
        int q= 0;
        for (int i=l; i <= r; ++i)
        {
        	for (int j = i; j <= r; ++j)
            {
        	   q = i ^ j;
                if (q > max) 
                {
        	       max = q;
                }
        
             }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXOR(_l, _r);
        System.out.println(res);
        
    }
}

/*
Problem Statement:
Given two integers, L and R, find the maximal value of A xor B,
where A and B satisfy the following condition:

L ≤ A ≤ B ≤ R

Input Format:
The input contains two lines; L is present in the first line and R in the second line.

Constraints:
1 ≤ L ≤ R ≤ 103

Output Format:
The maximal value as mentioned in the problem statement.

Example:

Input:
10
15

Output:
7

Explanation:
The input tells us that L=10 and R=15. All the pairs which comply to above condition are the following: 
10 XOR 10=0 
10 XOR 11=1 
10 XOR 12=6 
10 XOR 13=7 
10 XOR 14=4 
10 XOR 15=5 
11 XOR 11=0 
11 XOR 12=7 
11 XOR 13=6 
11 XOR 14=5 
11 XOR 15=4 
12 XOR 12=0 
12 XOR 13=1 
12 XOR 14=2 
12 XOR 15=3 
13 XOR 13=0 
13 XOR 14=3 
13 XOR 15=2 
14 XOR 14=0 
14 XOR 15=1 
15 XOR 15=0 
Here two pairs (10, 13) and (11, 12) have maximum xor value 7, and this is the answer.
*/