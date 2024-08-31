class ArrayDuplicateselement{
public static void duplicate(int arr[]){
	for(int i=0;i<=arr.length-1;i++){
		for(int j=i+1;j<=arr.length-1;j++){
			if(arr[i]==arr[j]){
				System.out.println(arr[j]);
			}
			
		}
	}
	
}
 public static void main(String arg[]){
	 int arr[]={10,20,30,40,10,40};
	 
	 duplicate(arr);
 }
}