//Nama  : Diana Adilla Lubis
//NIM   : M0521018

public class PegawaiTetap implements Pegawai{
    //attribut
    private String idPegawai;
    private String namaPegawai;
    private String alamatPegawai;
    private int gajiPokok;
    private int tunjangan;

    //constructor
    PegawaiTetap(String idPegawai, String namaPegawai, String alamatPegawai, int gajiPokok, int tunjangan){
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.alamatPegawai = alamatPegawai;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    @Override
    public int hitungGaji(){
        int gajiTotal;
        gajiTotal =  this.gajiPokok + this.tunjangan;
        return gajiTotal;
    }

    //berfungsi untuk mendapatkan representasi String dari sebuah objek
    @Override
    public String toString(){
        return "\nID Pegawai \t: " + this.idPegawai +
               "\nNama Pegawai \t: " + this.namaPegawai +
               "\nAlamat Pegawai \t: " + this.alamatPegawai +
               "\nGaji Pokok \t: " + this.gajiPokok +
               "\nTunjangan \t: " + this.tunjangan +
               "\nGaji Total \t: " + hitungGaji();   
    }

    //getter
    //berfungsi untuk read only
    public String getIdPegawai(){
        return this.idPegawai;
    }

    public String getNamaPegawai(){
        return this.namaPegawai;
    }

    public String getAlamatPegawai(){
        return this.alamatPegawai;
    }

    public int getGajiPokok(){
        return this.gajiPokok;
    }

    public int getTunjangan(){
        return this.tunjangan;
    }

    //setter
    //berfungsi untuk write only
    public void setAlamatPegawai(String alamatPegawai){
        this.alamatPegawai = alamatPegawai;
    }

    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }
}