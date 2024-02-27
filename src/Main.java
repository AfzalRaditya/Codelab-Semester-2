import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class Main {
    public static void main(String[] args) {
        String Nama;
        String Kelamin;
        String TanggalLahir;
        Scanner Input= new Scanner(System.in);
        System.out.print("Masukkan Nama:");
        Nama = Input.nextLine();
        System.out.print("Masukkan Jenis Kelamin (P/L):");
        Kelamin= Input.nextLine();
        System.out.print("Masukkan tanggal lahir(Tahun-Bulan-Hari):");
        String Umur = Input.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(Umur);
        System.out.println("Nama:" + Nama);
        if (Kelamin.equalsIgnoreCase("P")){
            System.out.println("Kelamin: Perempuan");
        }
        else{
            System.out.println("Kelamin: Laki-Laki");
            System.out.println("Umur:" + Umur);
            LocalDate hariIni = LocalDate.now();
            Period usia = Period.between(tanggalLahir, hariIni);
            System.out.println("Usia: " + usia.getYears() + " tahun, " +
                    usia.getMonths() + " bulan, dan " + usia.getDays() + " hari.");
        }
    }
}