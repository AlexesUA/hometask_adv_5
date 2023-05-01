package ua.edu.cbs.lms.hometask_adv_5.task2;

import ua.edu.cbs.lms.hometask_adv_5.errorhandler.ErrorHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);

        System.out.print("Enter Class name with path (et: java.lang.String): ");


        try {
            Class<?> inputClass = Class.forName(scInput.nextLine());

            System.out.println("Full name Class: " + inputClass.getName());
            System.out.println("Simple name Class: " + inputClass.getSimpleName());
            System.out.println("Access modifiers: " + inputClass.getModifiers());
            System.out.println("Package Class: " + inputClass.getPackage());
            System.out.println("Superclass: " + inputClass.getSuperclass());
            System.out.println("Interfaces: " + inputClass.getInterfaces());

        }catch (Exception error){
            ErrorHandler.errorHandling(error);
        }

    }
}
