package TesString;

public class StringOperations {
	
	public static void main(String[] args) {
		String string1 = "Hello";
		String string2 = "Ifany";
		String string3 = "";
		string3 = "How Are You".concat(string2);
		System.out.println("string3 : "+string3);
		System.out.println("Length :" +string1.length());
		System.out.println("Sub : " +string3.substring(0,5));
		System.out.println("Upper : "+string3.toUpperCase());
		
		String string4 = "How Are You"+string2;
		System.out.println("String4 : "+string4);
		System.out.println(string2.indexOf('a'));
		System.out.println(string2.charAt(2));
		
		String S1 = "abc";
		String S2= "cde";
		System.out.println(S1.compareTo(S2));
		
		String s1 = "abc";
		String s2= "ABC";
		System.out.println(s1.equals(s2));
		
	}
}
