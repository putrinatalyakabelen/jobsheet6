import java.util.Scanner;

/**
 * Pemilihan2Percobaan311_1
 */
public class Pemilihan2Percobaan311_1 {

    public static void main(String[] args) {
        Scanner Input11 = new Scanner (System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan Kategori : ");
        kategori = Input11.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = Input11.nextInt();

        if (kategori.equals ("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : " + gajiBersih);
            } else if (kategori.equals ("pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 350000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : " + gajiBersih);
        } 
        else {
            System.out.println("Masukkan kategori Salah");}
}
}

