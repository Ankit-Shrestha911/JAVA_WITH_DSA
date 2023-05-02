package Pattern1;
public class startPattern {
    public static void main(String[] args) {

        int n = 50;

        for(int i=1; i<=n; i++) // row
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        
    }
    
}
