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