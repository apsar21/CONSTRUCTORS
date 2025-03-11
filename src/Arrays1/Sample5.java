
public class Sample5 {

	public static void main(String[] args) {
		int []arr= {10,20,30,40,50,60};
		int temp[]=new int[2];
		for(int i=0;i<arr.length-2;i++) {
			arr[i]=arr[i+2];
		}
		//to store 10,20  values
		for(int j=arr.length-2;j< arr.length-1;j++) {
			arr[arr.length-2]=temp[j];
		}
		for(int var:arr) {
			System.out.println(var);
		}
		// TODO Auto-generated method stub

	}

}
