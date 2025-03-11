package Strings;

public class words {

	public static void main(String[] args) {
		String words="my name is apsar";
		String arr[]=words.split(" ");
		int count=0;
		for(int i=0;i<words.length()-1;i++) {
			if(words.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(+ ++count);
		// TODO Auto-generated method stub

	}

}
