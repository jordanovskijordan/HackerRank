import java.util.Scanner;

public class Angryprofessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
        int q=0;
        int k;
        int n;
        int t= a.nextInt();
        String output = "";
        while(t>0)
            {
        	q = 0;
            n=a.nextInt();
            k=a.nextInt();
            for(int i=1;i<=n;i++)
                 if(a.nextInt()<=0)
                	q++;
            
            if(q>=k)
                output+="NO\n";
            
            else
                output+="YES\n";
               
            
            t--;
        }
        System.out.println(output);
	}

}
