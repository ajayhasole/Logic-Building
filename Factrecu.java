
class Factrecu{
public static int fact(int n){
if(n==1)
 return 1;

return n*fact(n-1);
}
 public static void main(String arg[]){
         int a=fact(5);
		 System.out.println(a);
 }
}