/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String newStr= "";
        for(int i=0; i<s.length(); i++){ // runs the loop according to strings length
            if((newStr.indexOf((s.charAt(i))) == -1) || (s.charAt(i) == 32)) { // checks if the current char is in the loop or its a space
                newStr += s.charAt(i); // if so, adds to new string
            }
        }
        return newStr;
    }
}