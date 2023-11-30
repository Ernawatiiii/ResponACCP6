public class Kendaraan {
    int Roda = 3;
    int Mesin = 700;
    String BahanBakar = "Solar";
    void tampil(){
            System.out.println("Banyak roda pada mobil:" + this.Roda);
            System.out.println("Mesin mobil ini: " + this.Mesin);
            System.out.println("BahanBakar  : " + this.BahanBakar);
        }
}
class Mobil extends Kendaraan{
        int BanyakRoda = 4;
        int Mesin = 1000;
        String BahanBakar = "Pertamax";
        // void tampil(){
        //     System.out.println("Banyak roda pada mobil:" + this.BanyakRoda);
        //     System.out.println("Mesin mobil ini: " + this.Mesin);
        //     System.out.println("BahanBakar  : " + this.BahanBakar);
        // }

    }

class SepedaMotor extends Kendaraan{
        String BahanBakarRoda = "tubles";
        int Mesin = 125;
        String BahanBakar = "Pertalite";

        void tampil(){
            System.out.println("BahanBakar roda motor : " + this.BahanBakarRoda);
            System.out.println("Mesin Motor : " + this.Mesin);
            System.out.println("BahanBakar  motor : " + this.BahanBakar);
        }
    
    }
    class main{
        public static void main(String[] args) {
            Mobil mbl = new Mobil();
            SepedaMotor motor = new SepedaMotor();
            mbl.tampil();
            System.out.println("");
            motor.tampil();

        }
    }




