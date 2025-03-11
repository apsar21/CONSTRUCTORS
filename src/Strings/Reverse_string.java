package Strings;

public class Reverse_string {

	public static void main(String[] args) {
		String input= "Hello my name is apsar";
		String [] temp=input.split(" ");
		String output=" ";
		for(int i=0;i<temp.length;i++) {
		for(int j=temp[i].length()-1;j>=0;j--) {
			output=output+temp[i].charAt(j);
		}
		output=output+" ";
		}
		System.out.println(output);
		// TODO Auto-generated method stub

	}

}
