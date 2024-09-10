import java.util.*;
class ReverseNumber{
      
	  public static int rev(int num){
	  
	          int reverse=0;
			  while(num!=0){
			       int remanider=num%10;
				   reverse=reverse*10+remanider;
				   num=num/10;
			  
			  }
	         return reverse;
	  }

  public static void main(String arg[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Number :");
  int num=sc.nextInt();
  System.out.println(rev(num));
  } 
}