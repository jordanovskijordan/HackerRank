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