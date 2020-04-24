

package ch04;

/*
 * @author RIFFANDI
 */

public class MenampilkanJumlahAngkaDidalamArrayTersebutDiAtasDenganSeluruhAngkaSebelumnya {
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int jum=0;
          
          for( int num : nilai) {
          jum = jum+num;
          }
      
          System.out.println("Jumlah Nilai Dalam Array adalah :" +jum);
          for (int i = 0; i < nilai.length; i++){
            System.out.println("Indeks Ke-"+i+" = "+ nilai[i]);
    }
}
}