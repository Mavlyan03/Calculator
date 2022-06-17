package com.company;

public class MyException extends Throwable implements AutoCloseable {

    public void size() {
        System.err.println("You enter wrong number! \nPlease enter number 0 till 10!");
    }


    @Override
    public void close() throws Exception {}
}
