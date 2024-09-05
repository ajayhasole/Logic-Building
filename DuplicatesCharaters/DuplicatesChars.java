import java.util.*;
class DuplicatesChars{
	public static void duplicate(String str){
		int len=str.length();
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		String sortstr=new String(ch);
		for(int i=0;i<len;i++){
			int count=1;
			while(i<len-1 && sortstr.charAt(i)==sortstr.charAt(i+1)){
				count++;
				i++;
			}
			if(count>1){
				System.out.println(sortstr.charAt(i)+" Count="+count);
			}
		}
		//return str;
	}
	
	
public static void main(String arg[]){
	String str="Hello World";
	duplicate(str);
}


}