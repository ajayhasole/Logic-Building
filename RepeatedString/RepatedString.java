class RepatedString {
    public static void main(String arg[]) {
        String str = "java java";
        char c = ' ';
        
        if (str.length() == 0) {
            System.out.println("Empty String");
            return; // Exit if the string is empty
        }
        
        boolean foundNonRepeating = false;

        for (char i : str.toCharArray()) {
            
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                c = i;
                foundNonRepeating = true;
                break; 
            }
        }

        if (foundNonRepeating) {
            System.out.println("First non-repeating character: " + c);
        } else {
            System.out.println("All characters are repeating");
        }
    }
}
