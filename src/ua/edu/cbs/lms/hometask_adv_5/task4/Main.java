package ua.edu.cbs.lms.hometask_adv_5.task4;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Rex", 2, true);
        System.out.println("Before changing Animal fields:");
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Is predator: " + cat.getIsPredator());
        cat.changeAnimalFields("Chappy", 3, false);
        System.out.println("After changing Animal fields:");
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Is predator: " + cat.getIsPredator());
    }
}
