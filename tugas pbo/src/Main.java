import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama;
        char kelamin;
        int tanggallahir, bulanlahir, tahunlahir, umur;
        Scanner objInput = new Scanner(System.in);


        System.out.print("Masukkan nama: ");
        nama = objInput.nextLine();
        System.out.print("Jenis Kelamin (L/P): ");
        kelamin = objInput.next().charAt(0);
        System.out.print("Masukkan Tanggal lahir (yyyy/mm/dd): ");
        tahunlahir = objInput.nextInt();
        bulanlahir = objInput.nextInt();
        tanggallahir = objInput.nextInt();


        LocalDate sekarang = LocalDate.now();
        LocalDate tanggalLahir = LocalDate.of(tahunlahir, bulanlahir, tanggallahir);
        umur = sekarang.getYear() - tahunlahir;

        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (kelamin == 'L' || kelamin == 'l' ? "Laki-laki" : "Perempuan"));
        System.out.println("Umur: " + umur + " tahun");

    }
}
