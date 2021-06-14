package EnkapsulasiDemo;
import java.text.DecimalFormat;

public class DemoEnkapsulasi{
    public static void main(String[] args) {
        DecimalFormat digitpresisi=new DecimalFormat("0,00");
        System.out.println("\n Demo enkapsulasi");
        System.out.println("====================");
        HitungGaji tony = new HitungGaji();

        tony.setGaji(25000000);
        tony.hitungGaji();
        System.out.println("Informasi Gaji Pegawai");
        System.out.println("\nBesar Gaji Kotor = " +digitpresisi.format(tony.getGajiKotor()));
        System.out.println("\nBesar Gaji yang di bawa pulang = "+digitpresisi.format(tony.getGajiBersih()));
    }
}

     

 