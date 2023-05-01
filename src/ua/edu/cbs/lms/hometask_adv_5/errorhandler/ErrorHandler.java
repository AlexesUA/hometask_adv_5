package ua.edu.cbs.lms.hometask_adv_5.errorhandler;

public class ErrorHandler {
    public static void errorHandling(Exception error){
        System.out.println("ERROR: " + error.getMessage());
    }
}
