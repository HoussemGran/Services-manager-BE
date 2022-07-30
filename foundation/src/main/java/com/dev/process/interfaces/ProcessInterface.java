package com.dev.process.interfaces;


/**
    Implement this interface in order to create a new process in our system
 */

public interface ProcessInterface {


    String getName();
    String getDescription();
    String getType();
    String getStatus();
    String getPlatform();


}
