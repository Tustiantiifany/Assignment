package ArrayTes;

public class Bouquet {
	public static void main (String[] args) {
		String[] myBouquet = {"Rose", "Sunflower", "Daisy", "Dandelion", "Violet", "Lily"};
		
		for (int index = 0; index < myBouquet.length; index++) {
			System.out.println(myBouquet[index]+" ");
			
		}
		
		for (String myFlower : myBouquet) {
			System.out.println(" ");
			System.out.println(myFlower);
		}
	}

}
