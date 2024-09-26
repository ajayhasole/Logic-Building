class LengthofLastWord{
	public static int lengthOfLastWord(String s) {
    String trimmed = s.trim();
    int lastSpaceIndex = trimmed.lastIndexOf(' ');
    return trimmed.length() - lastSpaceIndex - 1;
}
public static void main(String arg[]){
 System.out.println(lengthOfLastWord("Ajay"));
}
}