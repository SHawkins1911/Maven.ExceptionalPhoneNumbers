package com.zipcodewilmington.exceptions;

/**
 * Created by leon on 5/10/17.
 */ // Checked Exception
public final class InvalidPhoneNumberFormatException extends Exception {

    private String errorMessage;

    public InvalidPhoneNumberFormatException(){}

    public InvalidPhoneNumberFormatException(String message){
        errorMessage = message;
    }

    public String getErrorMessage(){
        return errorMessage;
    }
}
