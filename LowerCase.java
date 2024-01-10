/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) { // function that returns the lower case version of the input string
        String newStr = ""; // init a new str
        for(int i=0; i<s.length();i++) { // runs on all chars of the string
            if ((s.charAt(i) >= 65) && (s.charAt(i) <= 90)) { // checks if char is UPPERCASE letter
                int temp = s.charAt(i) + 32; // checks lowercase ASCII code
                newStr += (char) temp; // writes lowercase letter instead
            } else newStr += s.charAt(i);
        }
        return newStr;
    }
}