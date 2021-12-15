package chapter8Data;

import java.util.Scanner;

public class RepeatExercice {
    private static Scanner scanner = new Scanner(System.in);
    private String userName;
    private String passeWord;
    private boolean valid ;
    private String errorMessage ;

    private  RepeatExercice(String userName, String passeWord){
        this.userName = userName;
        this.passeWord = passeWord;
    }
    public static void main (String[] args){
        var validator = login();
        validator.printErrorsMessages();
        do{
            var newPassword = validator.getProposedPassword();
            validator.getConditionChangeLogin(newPassword);
            if(!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }
        }while (!validator.isValid());
        System.out.println("The proposed password is valid");
        validator.closeScanner();
    }
    public String getProposedPassword(){
        System.out.println("Enter your new password:");
        return scanner.nextLine();
    }
    private void printErrorsMessages(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }
    private static RepeatExercice login(){
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        return new RepeatExercice(username ,password);
    }
    public boolean isValid(){
        return valid;
    }
    public String getErrorMessage(){
        return errorMessage;
    }
    public void closeScanner(){
        scanner.close();
    }
    private void getConditionChangeLogin(String newPassword){
        valid = true;
        errorMessage = "";
        if (newPassword.length() < 8) {
            valid = false;
            errorMessage += " Your password must be at least 8 characters.";
        }
        if(newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must include an uppercase letter.";
        }

        if(newPassword.matches("[a-zA-Z0-9 ]*")){
            valid = false;
            errorMessage += "\n Your password must include a special character (e.g. %,$[:).";
        }

        if(newPassword.toUpperCase().contains(userName.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password cannot contain your username.";
        }

        if(newPassword.equals(passeWord)){
            valid = false;
            errorMessage += "\n Your password must be different from your current password.";
        }
    }
}
