import java.util.Scanner;
 
public class Stringreverse{
 
public static void main(String args[])
 {
 String kata, dibalik = "";
 Scanner in = new Scanner(System.in);
 System.out.println("Masukkan kata");
 kata= in.nextLine();
 
 for ( int i = kata.length()-1 ; i >= 0 ; i-- )
 dibalik = dibalik + kata.charAt(i);
 
 System.out.println("Kata dibalik : -> "+dibalik );
 }
 
}