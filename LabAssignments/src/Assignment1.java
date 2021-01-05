/**
 * Display String in reverse order word by word
 * 
 *
 */
public class Assignment1 {

	public static void main(String[] args) {
		String str1 = "Hello Dear Friend";
		//Output as  :  Friend Dear Hello
		String output = reverseString(str1);
		System.out.println(output);
		

	}

	private static String reverseString(String input) {
		String[] result =input.split(" ");
		int s=result.length-1;
		String ou="";
		for(int i=s;i>=0;i--)
		{
			ou=ou+result[i];
			ou+=" ";
			
		}
		
		
		return ou;
	}

}

