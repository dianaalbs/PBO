class Karyawan {
    String id;
    String nama;
    String alamat;

    int total_gaji;
    void display () {
        System.out.println("ID Karyawan: " +this.id);
        System.out.println("Nama Karyawan: " +this.nama);
        System.out.println("Alamat Karyawan: " +this.alamat);
    }

    int hitungGaji() {
        return total_gaji;
    }
}

class KaryawanTetap extends Karyawan {
    int gaji;
    int uang_makan;
    int tunjangan;

    int hitungGaji() {
        int total_gaji = gaji + uang_makan + tunjangan;
        System.out.println("Gaji Karyawan: " +total_gaji);
        System.out.println("");
        return total_gaji;
    }
}

class KaryawanKontrak extends Karyawan {
    int gaji_harian;
    int jumlah_hari_masuk;

    int hitungGaji() {
        int total_gaji = gaji_harian * jumlah_hari_masuk;
        System.out.println("Gaji Karyawan: " +total_gaji);
        System.out.println("");
        return total_gaji;
    }
}

public class Main {
    public static void main (String[] args) {
        KaryawanTetap karyawantetap = new KaryawanTetap();
        karyawantetap.id = "009";
        karyawantetap.nama = "Mark";
        karyawantetap.alamat = "Canada";
        karyawantetap.gaji = 55000000;
        karyawantetap.uang_makan = 2000000;
        karyawantetap.tunjangan = 15000000;

        KaryawanKontrak karyawankontrak = new KaryawanKontrak();
        karyawankontrak.id = "024";
        karyawankontrak.nama = "Johnny";
        karyawankontrak.alamat = "Amerika";
        karyawankontrak.gaji_harian = 350000;
        karyawankontrak.jumlah_hari_masuk = 20;
        
        System.out.println("Data Karyawan Tetap");
        System.out.println("===================");
        karyawantetap.display();
        karyawantetap.hitungGaji();

        System.out.println("Data Karyawan Kontrak");
        System.out.println("=====================");
        karyawankontrak.display();
        karyawankontrak.hitungGaji();
    } 
}