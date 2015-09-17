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
// Ostava prazno mesto pred celoto pecanjete, zaso nz