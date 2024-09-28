class Permutations {
public static void permute(String str, String result) {
    if (str.isEmpty()) {
        System.out.println(result);
    } else {
        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i + 1), result + str.charAt(i));
        }
    }
}
	public static void main(String arg[]){
		permute("Ajay","Hasole");

}
}