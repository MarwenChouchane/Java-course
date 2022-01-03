package chapter10Polymorphism;

public class Zoo {
    public static void main (String [] arg){
        Dog dog = new Dog();
        dog.fetch();
        dog.makeSound();
        feed(dog);

        Animal boby = new Cat();
        boby.makeSound();
        feed(boby);

        boby = new Dog();
        boby.makeSound();
        ((Dog) boby).fetch();
        feed(boby);
    }
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here is your dog food");
        }else if(animal instanceof Cat){
            System.out.println("Here is your cat food");
        }
    }
}
