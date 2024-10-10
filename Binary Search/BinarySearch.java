class BinarySearch{

      public static int binary(int key,int arr[]){
	  
	        int l=0;
			int h=arr.length-1;
			
			while(l<=h){
			   int m=(l+h)/2;
			   if(arr[m]==key){
			    return m;
			   }
			  if(arr[m]<key){
			  
			  l=m+1;
			  
			  }else{
			      h=m-1;
			  }
			}
			return -1;
	  }

public static void main(String arg[]){
int arr[]={10,20,30,40,50,60};
int n=binary(60,arr);

if(n!=-1)
  System.out.println("Element Found At "+n);
System.out.println("Element Not Found ");
  
}
}