

package ch04;

/*
 * @author RIFFANDI
 */

public class MenampilkanAngkaGanjilDiArray {
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        System.out.println("Angka Ganjil dalam Index Adalah = ");
        
        for (int i = 0; i < nilai.length; i++){
             if (nilai [i] % 2!= 0){
                 System.out.print(nilai[i]+" ");
            }
        }
    }
}
