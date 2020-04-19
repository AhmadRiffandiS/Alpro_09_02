package ch03;
/*
 * @author RIFFANDI
 */
   import java.util.Scanner;

public class AngkaTerbesarDari2Bilangan {
 
 public static void main(String[] args) {
 int pertama, kedua, terbesar;
 Scanner scan = new Scanner(System.in);
  
 System.out.print("Masukkan bilangan pertama = ");
 pertama = scan.nextInt();
  
 System.out.print("Masukkan bilangan kedua = ");
 kedua = scan.nextInt();
  
 if(pertama>kedua){
 terbesar = pertama;

 }else{
 terbesar=kedua;
 }
 System.out.println("Bilangan terbesar adalah "+terbesar);
  
 }
 
}
