
public class reversetwo {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int temp[]=new int[arr.length];
		int n=0;
		for(int i=arr.length-1;i>=0;i--) {
			temp[n]=arr[i];
			n++;
		}
		for(int var:temp) {
			System.out.println(var);
		}
		// TODO Auto-generated method stub

	}

}
