class StringEqual{

public static boolean equalstring(String str1,String str2){
	
	if(str1.equals(str2))
		return true;
	return false;
}
public static void main(String arg[]){
String str1="Hello";
String str2="Hello1";
  if(equalstring(str1,str2))
	  System.out.println(str1+" And "+str2+" Both Are Equal");
  else
	  System.out.println("Both Are Not Equal");
}
}