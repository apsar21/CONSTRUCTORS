
public class SPY1 {

	public static void main(String[] args) {
		int n=12;
		int sum=0;
		int product=1;
		int temp=n;
		while(temp>0) {
			sum=sum+temp%10;
			product=product*temp%10;
			temp=temp/10;
		}
		if(sum==product) {
			System.out.println( n +" is a SPY number");
		}
		else {
			System.out.println( n + " is not a SPY number");

		}
		// TODO Auto-generated method stub

	}

}
