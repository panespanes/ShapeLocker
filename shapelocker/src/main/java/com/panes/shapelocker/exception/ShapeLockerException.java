package com.panes.shapelocker.exception;

/**
 * Created by panes on 2016/7
 */
public class ShapeLockerException extends NullPointerException {
    private String msg;
    public ShapeLockerException (String msg){
        this.msg = msg;
    }
    @Override
    public String getMessage() {
        return this.msg;
    }
}
