package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String s="Selenium";
		int len=s.length();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}

	}

}
