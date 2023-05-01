package ua.edu.cbs.lms.hometask_adv_5.task4;

import java.lang.reflect.Field;

public class Cat {


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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
