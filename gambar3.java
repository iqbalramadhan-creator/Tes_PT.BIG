import java.util.Scanner;

public class gambar3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // JUMLAH ANGKA YANG DIINGINKAN
        System.out.print("MASUKKIN JUMLAH ANGKA BROO: ");

        int rows = scanner.nextInt();
        System.out.println("## NYETAK GAMBAR LHUUU: ##");
        
        int alphabet = 65;
        
        
        
       for(int i=rows-1;i>=0 ;i--)
        {
            for(int j=0;j<=rows-i;j++)
            {
                System.out.print((char)(alphabet+j));
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=rows-i; l>=0; l--)
            {
                if(l!=rows) 
                    System.out.print((char)(alphabet+l));
            }
            
           System.out.println();
        }
        
         for(int i=1;i<=rows;i++)
        {
            for(int j=0;j<=rows-i;j++)
            {
                System.out.print((char)(alphabet+j));
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=rows-i; l>=0; l--)
            {
                if(l!=rows)    
                    System.out.print((char)(alphabet+l));
            }
           System.out.println();
        }
        
    }
}