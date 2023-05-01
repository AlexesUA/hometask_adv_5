package ua.edu.cbs.lms.hometask_adv_5.task3;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {

        SomeClass someClass = new SomeClass();
        Class<?> refClass = someClass.getClass();

        System.out.println("Class name: " + refClass.getName());

        Constructor[] constructorsSomeClass = refClass.getConstructors();
        System.out.println("\nConstructor in SomeClass");
        for(int i=0; i<constructorsSomeClass.length; i++){
            System.out.printf("Constructor %s - Access: %s, Name: %s, Param: ",
                    i+1, Modifier.toString(constructorsSomeClass[i].getModifiers()),
                    constructorsSomeClass[i].getName());
            for (Parameter param: constructorsSomeClass[i].getParameters()){
                System.out.print("(" + param.getType() + ": " + param.getName() + "); ");
            }
            System.out.println();
        }


        Field[] fieldsSomeClass = refClass.getDeclaredFields();
        System.out.println("\nFields in SomeClass");
        for(int i=0; i<fieldsSomeClass.length; i++){
            System.out.printf("Field %s - Access: %s, Name: %s, Type: %s \n",
                    i+1, Modifier.toString(fieldsSomeClass[i].getModifiers()),
                    fieldsSomeClass[i].getName(), fieldsSomeClass[i].getType().getName());
        }

        Method[] methodsSomeClass = refClass.getMethods();
        System.out.println("\nMethod in SomeClass");
        for(int i=0; i<methodsSomeClass.length; i++){
            System.out.printf("Method %s - Access: %s, Return Type: %s, Name: %s,  Param: ",
                    i+1, Modifier.toString(methodsSomeClass[i].getModifiers()),
                    methodsSomeClass[i].getAnnotatedReturnType().getType(), methodsSomeClass[i].getName());
            for (Parameter param: methodsSomeClass[i].getParameters()){
                System.out.print("(" + param.getType() + ": " + param.getName() + "); ");
            }
            System.out.println();
        }





    }

}
