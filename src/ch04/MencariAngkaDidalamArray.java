

package ch04;

/*
 * @author RIFFANDI
 */
import java.util.Scanner;

public class MencariAngkaDidalamArray {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        System.out.println("Masukkan angka = ");
        int index = input.nextInt();
        Boolean benar= false;
        
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i]==index){
                System.out.println("Berada Pada Array ke " + i);
                benar = true;
            }
        }
         if (benar==false){
            System.out.println("Angka "+index+" tidak ada dalam array  ");
        }    
    }
}

