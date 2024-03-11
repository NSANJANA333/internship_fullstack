public class Strings1 {
	
	public static void main(String args[])
	{
		
		String str = "Helloworld";

		
		int index = 6;

		
		char ch = 's';

		
		System.out.println("Original String = " + str);

		str = str.substring(0, index) + ch
			+ str.substring(index + 1);

		
		System.out.println("Modified String = " + str);
	}
}
