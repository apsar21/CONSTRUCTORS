class Sample{
	public static void main(String[] args) {
		int[] arr= {25,35,10,89,66};
		int max=arr[0];
		int min=arr[0];
		int sum=0;
		int avg=0;
		for(int i=0;i<arr.length;i++) 
		{
			if (arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			sum=sum+arr[i];
		}
		avg=sum/arr.length;
				System.out.println(max);
				System.out.println(min);
				System.out.println(avg);


				
	}
	
}