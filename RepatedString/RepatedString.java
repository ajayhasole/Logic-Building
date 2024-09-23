class RepatedString{
public static void main(String arg[]){
  String str="java java";
  int index=0;
  char ch[]=str.toCharArray();
  char c=' ';
  if(str.length()==0){
	   System.out.println("Empty String");
  }
  for(char i: str.toCharArray()){
	  
	
  if(str.indexOf(i)==str.lastIndexOf(i)){
	  c=i;
	  break;
 
  } else{
   index+=1;
  }

  if(index==str.length()-1){
       System.out.println("All Repeating");
	}
	else{
	System.out.println("First non Repeating"+c);
	}
  }
  
 }


}