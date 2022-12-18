//Nama  : Diana Adilla Lubis
//NIM   : M0521018

public class App{
    public static void main(String[] args){

        PegawaiTetap [] arrayPegawaiTetap = new PegawaiTetap[5];
        PegawaiHonorer [] arrayPegawaiHonorer = new PegawaiHonorer[5];

        arrayPegawaiTetap[0] =  new PegawaiTetap("T001", "Budi", "Jakarta", 6500000, 3000000);
        arrayPegawaiTetap[1] =  new PegawaiTetap("T002", "Deni", "Bali", 5000000, 1500000);
        arrayPegawaiTetap[2] =  new PegawaiTetap("T003", "Revan", "Semarang", 4000000, 2000000);
        arrayPegawaiTetap[3] =  new PegawaiTetap("T004", "Arin", "Bekasi", 6000000, 2500000);
        arrayPegawaiTetap[4] =  new PegawaiTetap("T005", "Vina", "Yogyakarta", 5500000, 2500000);

        arrayPegawaiHonorer[0] =  new PegawaiHonorer("H001", "Andi", "Lampung", 2000000);
        arrayPegawaiHonorer[1] =  new PegawaiHonorer("H002", "Kartika", "Jakarta", 3500000);
        arrayPegawaiHonorer[2] =  new PegawaiHonorer("H003", "Joni", "Surakarta", 2500000);
        arrayPegawaiHonorer[3] =  new PegawaiHonorer("H004", "Gina", "Medan", 1500000);
        arrayPegawaiHonorer[4] =  new PegawaiHonorer("H005", "Harun", "Bogor", 2500000);
    
        ThreadPrint t1 = new ThreadPrint(arrayPegawaiTetap);
        ThreadPrint t2 = new ThreadPrint(arrayPegawaiHonorer);
        t1.start(); 
        t2.start();
    }
}
