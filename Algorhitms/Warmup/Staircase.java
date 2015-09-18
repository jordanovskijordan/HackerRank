public class Staircase {
    
    public static void main(String[] args) {
        b = new Scanner(System.in);
        int n=b.nextInt();
        for (int i=0;i<=n;i++) {
            for (int j=n-i-1;j>=0;j--) {
                System.out.print(" ");
            }
            for (int k=i;k>0;k--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
/*
Problem Statement:
Your teacher has given you the task to draw the structure of a staircase.
Being an expert programmer, you decided to make a program for the same.
You are given the height of the staircase.
You need to print a staircase as shown in the example.

Input Format:
You are given an integer N depicting the height of the staircase.

Constraints :
1 ≤ N ≤ 100

Output Format:
Draw a staircase of height N in the format given below.

Example:
     #
    ##
   ###
  ####
 #####
*/