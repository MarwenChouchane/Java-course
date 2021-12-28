package chapter9Inherance;

public class Person {
    private String name;
    private int age;
    private String gender;

    //Default constructor
    public Person(){
        System.out.println("In person default constructor");
    }
/*
    public Person(String name){
        System.out.println("In person 2nd constructor : name is set");
    }
*/
    public Person(int age){
        System.out.println("In person 3d constructor : age is set");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}