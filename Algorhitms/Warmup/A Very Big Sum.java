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