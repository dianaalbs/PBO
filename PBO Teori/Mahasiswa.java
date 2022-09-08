import java.util.Scanner;

public class Mahasiswa {
    String NIM, nama, jenisKelamin, alamat;

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();

        Scanner input = new Scanner(System.in);

        System.out.println("                  Masukkan Data Anda");
        System.out.println("--------------------------------------------------------");

        System.out.print("NIM             : ");
        String NIM = input.nextLine();

        System.out.print("Nama            : ");
        String nama = input.nextLine();

        System.out.print("Jenis Kelamin   : ");
        String jenisKelamin = input.nextLine();

        System.out.print("Alamat          : ");
        String alamat = input.nextLine();

        input.close();

        mahasiswa.isiData(NIM, nama, jenisKelamin, alamat);
        mahasiswa.printData();
    }

    public void isiData(String NIM, String nama, String jenisKelamin, String alamat) {
        this.NIM = NIM;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    public void printData() {
        System.out.println();
        System.out.println("                    Data Mahasiswa");
        System.out.println("--------------------------------------------------------");
        System.out.println("Nama            : " +this.nama);
        System.out.println("NIM             : " +this.NIM);
        System.out.println("Jenis Kelamin   : " +this.jenisKelamin);
        System.out.println("Alamat          : " +this.alamat);
    }
}
