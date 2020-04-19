

package ch03;

/*
 * @author RIFFANDI
 */
import java.util.Scanner;

public class MenentukanBilanganPembagiTerkecilSelainAngka1Dan2 {
    public static void main(String[] args) {
        int i=3;
        int n;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai = ");
        n = scan.nextInt();
        
      if (n % i == 0) {
			System.out.printf("Pembagi Terkecil adalah " +i);
		} else {
			do{
                            i++;
                        }while (n%i==0);
                        System.out.println("Pembagi Terkecil adalah " +i);
		
        
    }
}
}