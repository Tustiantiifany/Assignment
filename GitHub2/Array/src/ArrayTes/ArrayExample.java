package ArrayTes;

public class ArrayExample {
	public static void main (String[] args) {
		String[] dataProdi = new String[10];
		dataProdi[0]="Administrasi";
		dataProdi[1]="Agroteknologi";
		dataProdi[2]="Teknik Elektro";
		dataProdi[3]="Bahasa Arab";
		dataProdi[4]="Bahasa Inggris";
		dataProdi[5]="Teknik Informatika";
		dataProdi[6]="Fisika";
		dataProdi[7]="Kimia";
		dataProdi[8]="Biologi";
		dataProdi[9]="Managemen";
		
		for(int i=0 ; i < dataProdi.length; i++) {
			System.out.println(dataProdi[i]);
			if(dataProdi[i].equals("Bahasa Arab")) {
				continue;
			
			}
		}
	}
}
