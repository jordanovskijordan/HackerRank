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