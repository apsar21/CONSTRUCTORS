import java.util.Scanner;
public class idarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee no: ");
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the employee name no " +(i+1));
			arr[i]=sc.next();
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.println("Employee  no:" +(j+1)+ " is" +arr[j]);
		}
		
		
		// TODO Auto-generated method stub

	}

}
