package com.wmb.simplerpg.gameobject;

/**
 * Created by rob on 7/10/15.
 */
public class InvalidGameObjectTypeException extends Exception {
    public InvalidGameObjectTypeException() {
    }

    public InvalidGameObjectTypeException(String message) {
        super(message);
    }

    public InvalidGameObjectTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGameObjectTypeException(Throwable cause) {
        super(cause);
    }

    public InvalidGameObjectTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
