import java.util.Scanner;

public class sample3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of companies:");
		int m=sc.nextInt();
		System.out.println("Enter no of employees in each company :");
		int n=sc.nextInt();
		String [][]arr= new String [m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("Enter the employee names from company no: " + (j+1) );
				arr[i][j]=sc.next();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("The name of employee no: "+(j+1)+ "Company no"+(i+1)+"is"+arr[i][j]);
			}

		}


		
		// TODO Auto-generated method stub

	}

}
