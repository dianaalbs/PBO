import 

public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;
    
    Mahasiswa(String nim, String nama, String alamat, char jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        }

    void cetakData() {
        System.out.println("Data Mahasiswa ");
        System.out.println("===============");
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
    }

    public static void main(String[] args) {
    Mahasiswa mhs = new Mahasiswa("M0501001", "Patrick Star", "Bikini Bottom", 'L');
    
    mhs.cetakData();
    }
}