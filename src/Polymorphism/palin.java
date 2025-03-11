import java.util.Scanner;
public class palin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur number:");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while(temp > 0) {
			sum=sum*10+temp %10;
			temp=temp/10;
		}
		if(num==sum) {
			System.out.println(num + "is a Palindrone");
			}
		else {
			System.out.println(num + "is  not a Palindrone");
		}

		// TODO Auto-generated method stub

	}

}
