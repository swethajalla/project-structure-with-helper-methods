package exceptions;

public class DateProviderException extends RuntimeException{

    /**
     * Generic exception constructor
     */
    public DateProviderException(){
        super("Data exception encountered when running the flow");
    }

    /**
     * Generic exception with message
     * @param message Messsage to accompany the exception
     */
    public DateProviderException(String message){
        super(message);
    }

    /**
     * Generic exception with the cause
     * @param message Message to be displayed
     * @param reason Cause for the exception
     */
    public DateProviderException(String message,Throwable reason){
        super(message,reason);
    }
}
