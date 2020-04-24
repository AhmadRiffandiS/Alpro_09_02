

package ch04;

/*
 * @author RIFFANDI
 */

public class MenghitungJumlahAngkaSelisihYangDitampilkan {
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int a,b,c,d,e,f,g;
        a = (nilai[0]-nilai[1]);
        b = (nilai[1]-nilai[2]);
        c = (nilai[2]-nilai[3]);
        d = (nilai[3]-nilai[4]);
        e = (nilai[4]-nilai[5]);
        f=(nilai[5]-nilai[6]);
        g= a+b+c+d+e+f;
        
        System.out.println("82-12 = "+ a);
        System.out.println("41-38 = "+ b);
        System.out.println("19-26 = "+ c);
        System.out.println("9-48 = "+d);
        System.out.println("20-55 = "+e);
        System.out.println("8-32 = "+f);
        System.out.println(" Jumlah Dari Semua Selisih Adalah = "+g);
    }

}
