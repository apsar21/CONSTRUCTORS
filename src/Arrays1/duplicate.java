import java.util.Arrays;
public class duplicate {

	public static void main(String[] args) {
		int arr[]= {10,10,20,20,30,40,50};
		    Arrays.sort(arr);
		        int temp=arr[0];
		        System.out.println(temp);
		        for(int i=0;i<arr.length;i++){
		            if(arr[i]!=temp){
		            	temp=arr[i];
		            	System.out.println(temp);
		            }
		            
		        }
		        

		        
		   
		
		// TODO Auto-generated method stub

	}

}
