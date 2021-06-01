package ControlStatementProject;
import java.util.Scanner;
public class leapYearCalculator {
	
	
	int tahun;
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Masukkan Bulan (dalam angka 1-12) : ");
	int bulan = scan.nextInt();
	System.out.println("Masukkan Tahun : ");
	int tahun = scan.nextInt();
	
	String type = new String();
	type = (bulan % 2 ) == 0 ? "Genap" : "Ganjil";
	System.out.println("Bulan ini merupakan bulan "+type);
	
	switch(bulan) {
	case 1:
		System.out.println("Jumlah hari 31");
		break;
	case 2:
		if(tahun % 4 == 0 && tahun%100 != 0) {
			System.out.println("Tahun kabisat, maka Jumlah Hari 29");
		}
		else if (tahun%400 == 0) {
			System.out.println("Bukan tahun kabisat, jumlah hari 28");
		}
		break;
	case 3:
		System.out.println("Jumlah hari 31");
		break;
	case 4:
		System.out.println("Jumlah hari 30");
		break;
	case 5:
		System.out.println("Jumlah hari 31");
		break;
	case 6:
		System.out.println("Jumlah hari 30");
		break;
	case 7:
		System.out.println("Jumlah hari 31");
		break;
	case 8:
		System.out.println("Jumlah hari 30");
		break;
	case 9:
		System.out.println("Jumlah hari 31");
		break;
	case 10:
		System.out.println("Jumlah hari 30");
		break;
	case 11:
		System.out.println("Jumlah hari 31");
		break;
	case 12:
		System.out.println("Jumlah hari 30");
		break;
	default:
		System.out.println("Inputan Salah !");
		break;
	}
	
	
	}

}
