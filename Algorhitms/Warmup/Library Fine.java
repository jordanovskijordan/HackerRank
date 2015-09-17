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
//Ne e dovrseno za u slucaj da e razlican dn i razlican mesec, ili godina i dn, ili mesec i godina.