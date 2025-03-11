
public class palindrome
 {

	public static void main(String[] args) {
		int num=121;
		int sum=0;
		int temp=sum;
		while(temp > 0) {
			sum=sum*10+temp%10;
			temp=temp /10;
		}
		if(sum==num) {
			System.out.println(num + "is a Palindrone");
			}
		else {
			System.out.println(num + "is  not a Palindrone");

		}
		// TODO Auto-generated method stub

	}

}
