class MissingElementArray{

public static void missingElement(int arr[],int n){
   int arr2[]=new int[n+1];
   for(int i=0;i<n-1;i++){
     arr2[arr[i]]++;
	 //System.out.println(arr2[i]);
   }
   for(int i=1;i<n;i++){
     if(arr2[i]==0){
	 System.out.println("Missing Element Is= "+i);
	 }
   }

}
public static void main(String arg[]){

int arr[]={1,2,3,5,6};
int n=arr.length;
missingElement(arr,n);
}
}