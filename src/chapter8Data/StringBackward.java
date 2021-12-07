package chapter8Data;

public class StringBackward {
    public static void main (String[] args){
        reverseString("Hello TAU ");
    }
    /**
     * print a string in a reverse order
     * @param text full string to be split
     */
    public static void reverseString(String text){
        for (int i = text.length()-1; i>=0 ; i--){
            System.out.print(text.charAt(i));
        }
    }
}
