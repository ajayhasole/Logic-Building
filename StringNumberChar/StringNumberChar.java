import java.util.*;
 class StringNumberChar{


     public static void charCount(String inputStr){
	 
	 HashMap<Character,Integer>hasmap=new HashMap<Character,Integer>();
	 char ch[]=inputStr.toCharArray();
	 for(char c:ch){
		 
		 if(hasmap.containsKey(c)){
			 
			 hasmap.put(c,hasmap.get(c)+1);
		 }else{
			 
			 hasmap.put(c,1);
		 }
	 }
	 for(Map.Entry entry:hasmap.entrySet()){
	     System.out.println(entry.getKey()+" "+entry.getValue());	 
	 }
	 
	 }
 public static void main(String arg[]){

String str="ajay hasole";
  charCount(str);
}
}