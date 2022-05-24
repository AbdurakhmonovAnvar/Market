package com.market.Market.exception;

public class Badrequest extends RuntimeException{
    public Badrequest(String message){
        super(message);
    }
}
