import java.util.Scanner;

public class kelompok2_11 {
    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);

        String golongan;
        int income;
        double pajak, netSalary;

        System.out.print("Masukan Golongan : ");
        golongan = sc11.nextLine();

        if (golongan.equalsIgnoreCase("pramusaji")) {
            System.out.print("Masukan income : ");
            income = sc11.nextInt();
            if (income <= 5000000) {
                pajak = 0.1;
                netSalary = income - (income * pajak);
                System.out.println("Gaji bersih anda : Rp" + netSalary);
            } else if (income <= 10000000) {
                pajak = 0.15;
                netSalary = income - (income * pajak);
                System.out.println("Gaji bersih anda : Rp" + netSalary);
            } else {
                pajak = 0.2;
                netSalary = income - (income * pajak);
                System.out.println("Gaji bersih anda : Rp" + netSalary);
            }

        } else if (golongan.equalsIgnoreCase("koki")) {
            System.out.print("Masukan income : ");
            income = sc11.nextInt();
            if (income <= 6000000) {
                pajak = 0.15;
                netSalary = income - (income * pajak);
                System.out.println("Gaji bersih anda : Rp" + netSalary);
            } else if (income <= 10000000) {
  pajak = 0.2;
                netSalary = income - (income * pajak);
                System.out.println("Gaji bersih anda : Rp" + netSalary);
            } else {
                pajak = 0.25;
                netSalary = income - (income * pajak);
                System.out.println("Gaji bersih anda : Rp" + netSalary);
            }

        }else{
            System.out.println("Golongan tidak ditemukan");
}
}
}