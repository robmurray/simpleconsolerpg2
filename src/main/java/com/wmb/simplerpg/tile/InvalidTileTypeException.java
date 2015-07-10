package com.wmb.simplerpg.tile;

/**
 * Created by rob on 7/10/15.
 */
public class InvalidTileTypeException extends Exception {
    public InvalidTileTypeException() {
    }

    public InvalidTileTypeException(String message) {
        super(message);
    }

    public InvalidTileTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidTileTypeException(Throwable cause) {
        super(cause);
    }

    public InvalidTileTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
