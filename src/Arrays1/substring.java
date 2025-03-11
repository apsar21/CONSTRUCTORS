package Arrays1;

public class substring {

	public static void main(String[] args) {
		String input=new String("myh name isg apsar");
		String arr[]= input.split(" ");
		for(int i=0;i<arr.length;i++) {
			String s1=arr[i].substring(1,2);
			s1=s1.toUpperCase();
			s1=s1+arr[i].substring(1);
			s1=s1+" ";
			System.out.print(s1);
			
			
		}
		// TODO Auto-generated method stub

	}

}
