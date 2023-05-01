package ua.edu.cbs.lms.hometask_adv_5.task4;

import ua.edu.cbs.lms.hometask_adv_5.errorhandler.ErrorHandler;

import java.lang.reflect.Field;

public class Cat extends Animal{


    public Cat(String name, int age, boolean isPredator) {
        super(name, age, isPredator);
    }

    public void changeAnimalFields(String newName, int newAge, boolean newIsPredator) {
        try {
            Field nameField = Animal.class.getDeclaredField("name");
            Field ageField = Animal.class.getDeclaredField("age");
            Field isPredatorField = Animal.class.getDeclaredField("isPredator");
            nameField.setAccessible(true);
            ageField.setAccessible(true);
            isPredatorField.setAccessible(true);
            nameField.set(this, newName);
            ageField.set(this, newAge);
            isPredatorField.set(this, newIsPredator);
        } catch (Exception error) {
            ErrorHandler.errorHandling(error);
        }
    }
}
