import java.util.Scanner;
public class jagged {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of companies:");
		int m=sc.nextInt();
		String arr[][]=new String[m][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter no of employess in company no:"+(i+1));
			arr[i]=new String[sc.nextInt()];
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the name of Employee no:"+(j+1)+"from company no"+(i+1));
				arr[i][j]=sc.next();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The name of Employee no"+(j+1)+"and company no"+(i+1)+"is"+arr[i][j]);
			}
		}// TODO Auto-generated method stub

	}

}
