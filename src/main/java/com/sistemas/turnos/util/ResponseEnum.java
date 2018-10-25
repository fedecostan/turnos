package com.sistemas.turnos.util;

public enum  ResponseEnum {
    SUCCES("SUCCESS"),
    ERROR("ERROR");

    private String response;

    ResponseEnum(String response) {
        this.response = response;
    }

    public String response(){
        return response;
    }
}
