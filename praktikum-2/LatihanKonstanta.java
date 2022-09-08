public class LatihanKonstanta {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";

    public static void main(String args[]) {
        //KURS_DOLLAR = 13500;  *error
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
        }
}

/*
1) Apa yang salah dengan source code tersebut?
=  Terdapat kesalahan pada KURS_DOLLAR yang ingin diubah nilainya.

2) Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
= keyword static merupakan sebuah perintah yang digunakan untuk mengakses variable atau method 
  pada class tertentu tanpa harus membuat suatu objek dari class.  

*/