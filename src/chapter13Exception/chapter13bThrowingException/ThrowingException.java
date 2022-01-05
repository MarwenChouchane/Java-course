package chapter13Exception.chapter13bThrowingException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowingException {
    public static void main (String arg[]){
        //createNewFile();
        numberExceptionHandling();
        try {
            createNewFileRethrow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createNewFile(){
        File file = new File("resources/nonexistant.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Directory does not existe");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws Exception{
        File file = new File("resources/nonexistant.txt");
            file.createNewFile();
    }

    public static void numberExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try {
             fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }finally {
            fileReader.close();
        }
    }
}
