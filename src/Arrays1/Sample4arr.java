import java.util.Scanner;
public class Sample4arr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of Organizations: ");
		int m=sc.nextInt();
		System.out.println("Enter no of companies: ");
		int n=sc.nextInt();
		System.out.println("Enter no of employees: ");
		int o=sc.nextInt();
		String[][][] details=new String[m][n][o];
		for(int i=0;i<m;i++) {
			System.out.println("Inside Organization no :"+(i+1));
			for(int j=0;j<n;j++) {
				System.out.println("Inside Company no :"+ (j+1));
			for(int k=0;k<o;k++) {
			System.out.println("Enter the name of the Employee no:" +(k+1));
			details[i][j][k]=sc.next();
			}
			}
		}
		
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					for(int k=0;k<o;k++) {
						System.out.println("The name of employee no: "+(k+1)+ "Organization no"+(j+1)+ "Company no"+(i+1)+"is"+details[i][j][k]);

					}
				}
				}

			}
			
		
		// TODO Auto-generated method stub

	}


