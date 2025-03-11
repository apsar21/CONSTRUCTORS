
public class reversingstring {

	public static void main(String[] args) {
		String input="Hello good morning";
		String output=" ";
		String []arr=input.split(" ");
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i].length()-1;j>=0;j--) {
				output=output+arr[i].charAt(j);
			}
			output=output+" ";
		}
		
		System.out.println(output);
		// TODO Auto-generated method stub

	}

}
