package Arrays1;

public class practice {

	public static void main(String[] args) {
		String input=new String("Hello world! good morning");
		String arr[]=input.split(" ");
		String output=" ";
		for(int i=arr.length-1;i>0;i--) {
			output=output+arr[i];
			output=output+" ";
			
		}
		System.out.print(output);
		// TODO Auto-generated method stub

	}

}
