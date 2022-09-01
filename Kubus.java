public class Kubus {

    int sisiKubus = 5;

    public Double hitungVolume() {

    Double volume = 0.0;
    volume = Double.valueOf(sisiKubus) * Double.valueOf(sisiKubus) * Double.valueOf(sisiKubus);
    return volume;
    }

    public int hitungLuasPermukaan() {
   
    int luasPermukaan = 0;
    luasPermukaan = 6 * this.sisiKubus * this.sisiKubus;
    return luasPermukaan;
    }
    
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
    
        System.out.println("Sisi kubus : "+kubus.sisiKubus);
        
        System.out.println("Volume kubus : "+kubus.hitungVolume());
        System.out.println("Luas permukaan kubus : "+kubus.hitungLuasPermukaan());
        }

    }