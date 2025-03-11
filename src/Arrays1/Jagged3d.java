import java.util.Scanner;
public class Jagged3d {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of organizations");
		int m=sc.nextInt();
		System.out.println("Enter no of companies:");
		int n=sc.nextInt();
		String arr[][][]=new String[m][n][];
		//intializing
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("Enter no of employess for  company no :"+(j+1)+"from org no"+(i+1));
			arr[i][j]=new String[sc.nextInt()];
		}
		}
		//Storing
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter name of employee no"+(k+1)+"from company no"+(j+1)+" and From org no"+(i+1));
					arr[i][j][k]=sc.next();
				}
			}
		}
		// Retriving3
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<arr[i].length;k++) {
					System.out.println("the name of Employee no"+(k+1)+" from company"+(j+1)+" and from org no"+(i+1)+"is:"+arr[i][j][k]);
				}
			}
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
