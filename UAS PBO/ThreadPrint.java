//Nama  : Diana Adilla Lubis
//NIM   : M0521018


class ThreadPrint extends Thread{
    
    //mendefiniskan array dari kelas Object dengan nama arrayObject
    Object[] arrayObject;

    //constructor
    public ThreadPrint (Object[] arrayObject){
        this.arrayObject = arrayObject;
    }
    
    @Override
    public void run(){
        //untuk setiap elemen objek disebut data di dalam array object, kemudian cetak data 
        for (Object data : arrayObject){
            System.out.println(data);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}