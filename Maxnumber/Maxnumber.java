import java.util.*;
class Maxnumber{
	
	public static void main(String arg[]){
		
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter Size Of Array");
	   int n=sc.nextInt();
	   int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
		}
		
		int min=arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]<min){
				min=arr[i];
			}
			
		}
		
			System.out.println("Array Mini Element "+min);
			
		
		
		
	}
	
}