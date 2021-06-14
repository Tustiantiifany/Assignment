package EnkapsulasiDemo;

public class HitungGaji {
   
        private double gajiKotor, gajiSetelahpajak;
        public double gajiBersih;
        private double potongan=75000.00;
        public void setGaji(double Gaji){
            gajiKotor=Gaji;
        }
        public void hitungGaji(){
            gajiSetelahpajak=gajiKotor-(0.2*gajiKotor);
            gajiBersih=gajiSetelahpajak-potongan;
        }
        public double getGajiKotor(){
            return gajiKotor;
        }
        public double getGajiBersih(){
            return gajiBersih;
        }
    }

