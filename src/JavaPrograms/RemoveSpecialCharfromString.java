package JavaPrograms;

public class RemoveSpecialCharfromString {

	//using Regular Expression ([^a-zA-Z0-9])
	public static void main(String[] args) {
		String s="Se#$%le()nium";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
