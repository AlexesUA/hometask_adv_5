package ua.edu.cbs.lms.hometask_adv_5.task4;

public class Animal {
    private String name;
    protected int age;
    public boolean isPredator;

    public Animal(String name, int age, boolean isPredator) {
        this.name = name;
        this.age = age;
        this.isPredator = isPredator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsPredator() {
        return isPredator;
    }

    public void setIsPredator(boolean predator) {
        isPredator = predator;
    }
}
