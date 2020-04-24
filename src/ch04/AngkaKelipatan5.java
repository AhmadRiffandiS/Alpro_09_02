

package ch04;

/*
 * @author RIFFANDI
 */

public class AngkaKelipatan5 {
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        System.out.println("Angka Kelipatan 3 didalam Index Adalah = ");
        
        for (int i = 0; i < nilai.length; i++){
             if (nilai [i] % 5 == 0){
                 System.out.print(nilai[i]+" ");
            }
        }
    }
}
