class SeparateNumberChar{
 public static void main(String arg[]){
   String str="Hello Wrold123";
   
   
   for(int i=0;i<=str.length()-1;i++){
	   	  char ch=str.charAt(i);

	   if(Character.isDigit(ch))
	   System.out.println(ch);
   }
}}