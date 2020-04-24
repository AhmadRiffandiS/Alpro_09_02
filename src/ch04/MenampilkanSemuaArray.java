

package ch04;

/*
 * @author RIFFANDI
 */

public class MenampilkanSemuaArray {
    
    public static void main(String[] args) {
        
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        for (int i = 0; i < nilai.length; i++){
            System.out.println("Indeks Ke-"+i+" = "+ nilai[i]);
        }
    }
}