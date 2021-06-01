package IFElse;

public class example {
	public static void main (String[] args) {
		int c = 3, b=2;
		System.out.println("min = " +(c<b ? c:b));
		
		int a=-10;
		int absValue = (a<0)?-a:a;
		System.out.println("abs : "+absValue);
		
		float result = true ? 1.0f :2.0f;
		System.out.println("Float = "+result);
		
		String s = false ? "dude, that was true" : "sorry dude, its false";
		System.out.println(s);
		
	}
}
