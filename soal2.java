import java.util.Scanner;

public class soal2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // MEMASUKKAN ANGKA UNTUK JUMLAH BINTANG YANG DIHASILKAN
        System.out.print("MASUKKAN JUMLAH BINTANG! ");

        int rows = scanner.nextInt();
        System.out.println("## Cetak Gambar Bintang: ##");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = rows-1; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}