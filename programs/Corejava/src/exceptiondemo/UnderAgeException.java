package exceptiondemo;

public class UnderAgeException extends Exception{

    private String errorMsg;
    public UnderAgeException(String message){
        this.errorMsg = message;
    }
}
