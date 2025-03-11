
public class vowels {

	public static void main(String[] args) {
		String input="   HELLO   ";
		input=input.trim();
		int count=0;
		for(int i=0;i<input.length();i++) {
			if (input.charAt(i)==(' ') &&input.charAt(i+1)!=' ') {
				count++;
			}
		}
		
		System.out.println("The no of Words are "+ ++count);
		// TODO Auto-generated method stub

	}

}
