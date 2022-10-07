package exceptions;

import static exceptions.FlowError.UNKNOWN_ERROR;

public class FlowRunFailedException {

    private FlowError reason = UNKNOWN_ERROR;

    public boolean shallTRetry = false;

    public FlowRunFailedException(FlowError reason,String message,Boolean retry){

        super(/*
                switch(reason){
                    case SERVER_ERROR -> "Server error has occured with message: %s".formatted(message);
                    *//*case AUTH_FAILURE -> "Authorization attempts failed. Message: %s".formatted(message);
                    case ACCESS_DENIED -> "Access is denied. Message: %s".formatted(message);
                    default -> "Exception encountered when running the flow with messgae: %s".formatted(message)*//*

                }*/

        );
        this.shallTRetry = retry;
        this.reason = reason;
    }


}
