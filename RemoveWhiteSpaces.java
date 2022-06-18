package in.Strings.com;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String s1= " R a ke  s  h  ";
		System.out.println(s1.trim());
		String s2=s1.replaceAll("\\s","");// \\s Uni code value
		System.out.println(s2);
		String s3="@ja^&$v&*&a";
	String s4=	s3.replaceAll("[@^$&*]", "");
	System.out.println(s4);
		
		
	}

}
