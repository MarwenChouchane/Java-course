package chapter8Data;
/*
Split string with spaces
*/
public class SplitStringNoEspace {
    public static void main (String[] args){
        addSpaces("HiWorldIt'sMeMarwen");
    }
    /**
     * Add spaces before each appercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);
        for (int i = 0 ; i < modifiedText.length() ; i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.print(modifiedText);
    }
}
