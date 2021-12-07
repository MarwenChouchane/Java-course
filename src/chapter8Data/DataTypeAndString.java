package chapter8Data;
/*
Count number of word in a string
Print them individually in new line
 */
public class DataTypeAndString {
    public static void main (String[] args){
        countWords("I Love Test Automation University ");
    }

    /**
     * Split a string into an array by tokenizing it
     * count word and print them
     * @param text full string to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contain %d words :", numberOfWords);
        System.out.println(message);
        for (int i=0 ; i < numberOfWords ; i++){
            System.out.println(words[i]);
        }
    }
}
