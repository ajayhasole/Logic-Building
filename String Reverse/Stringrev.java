import java.util.*;
class Stringrev{
public static String reversestring(String str){
	if(str.isEmpty())
	  return str;
	return reversestring(str.substring(1))+str.charAt(0);
}

    public static void main(String arg[]){
		
		String str="Hello World";
		String str1="";
		
		char ch;
		
		String str2="CDAC Mumbail";
		String str3=reversestring(str2);
		System.out.println(str3);
	 for(int i=0;i<=str.length()-1;i++){
		 ch=str.charAt(i);
         str1=ch+str1;
	         //System.out.println(str1);
		 
	 }
	         System.out.println(str1);
	
	/*for(int i=ch.length;i<=0;i--){
		
			         System.out.println(ch[i]);

	}*/
	
	ArrayList<String>s=new ArrayList<String>();
      s.add("Uddesh");
	  s.add("Vishal");
	  s.add("Ajay");
	  s.add("Aniket");
      System.out.println(s);
	  Collections.reverse(s);
	  System.out.println(s);

	}
	
}