package ArrayInObject;

public class Mahasiswa {
	private String nimMhs;
	private String namaMhs;
	private int umurMhs;
	
	public Mahasiswa() {
		nimMhs = "";
		namaMhs = "";
		umurMhs = 0;
	}

	public Mahasiswa (String nama, String nim, int umur){
		nimMhs=nim;
		namaMhs=nama;
		umurMhs=umur;

	}

	public void displayMhs(){
		System.out.println("NIM : "+nimMhs);
		System.out.println("\nNama : "+namaMhs);
		System.out.println("\nUmur : "+umurMhs);
	}
	public String getnimMhs(){
		return nimMhs;
	}
	public void setnimMhs(String n){
		nimMhs=n;
	}
	public String getnamaMhs(){
		return namaMhs;
	}
	public void setnamaMhs(String n){
		namaMhs=n;
	}
	public int getumurMhs(){
		return umurMhs;
	}
	public void setumurMhs(int n){
		umurMhs=n;
	}

}
