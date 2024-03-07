

import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa{

    String Nama;
    String NIM;
    String Jurusan;

    Mahasiswa (String Nama,String NIM,String Jurusan){
        this.Nama=Nama;
        this.NIM=NIM;
        this.Jurusan=Jurusan;
    }

    static void tampilUniversitas(){
        System.out.println("Universitas Muhammadiyah Malang");
    }

    void tampilDataMahasiswa(){

        System.out.println("Nama    :  " +Nama);
        System.out.println("NIM     :  " +NIM);
        System.out.println("Jurusan :  " +Jurusan);
        System.out.print("\n");
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Tambah Data Mahasiswa ");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Exit ");
            System.out.print("Pilihan (1-3): ");
            int pilihan=inputUser.nextInt();

            switch (pilihan) {
                case 1:
                    tambahData(inputUser,daftarMahasiswa);
                    break;
                case 2:
                    showData(daftarMahasiswa);
                    break;
                case 3:
                    exit();
                    break;
                default:
                    System.out.println("Pilihan Tidak ditemukan Masukan Angka (1-3) ");
                    break;
            }
        }

    }private static void tambahData(Scanner inputUser,ArrayList <Mahasiswa> daftarMahasiswa){

        System.out.print("Masukan Nama Mahasiswa : ");
        inputUser.nextLine();
        String Nama = inputUser.nextLine();

        String NIM;
        do {
            System.out.print("Masukan NIM Mahasiswa  : ");
            NIM = inputUser.nextLine();
            if(NIM.length()!=15)
                System.out.println("NIM harus 15 digit ");
        }while(NIM.length()!=15);

        System.out.print("Masukan Jurusan        : ");
        String Jurusan = inputUser.nextLine();

        Mahasiswa mhs = new Mahasiswa(Nama,NIM,Jurusan);
        daftarMahasiswa.add(mhs);
        System.out.println("Data Berhasil Ditambahkan");


    }private static void showData(ArrayList <Mahasiswa> daftarMahasiswa){

        Mahasiswa.tampilUniversitas();
        System.out.println("\nData Mahasiswa : ");
        for (Mahasiswa dataMahasiswa : daftarMahasiswa) {
            dataMahasiswa.tampilDataMahasiswa();
        }


    }private static void exit(){

        System.out.println("\nTerima Kasih");
        System.exit(0);
    }
}
