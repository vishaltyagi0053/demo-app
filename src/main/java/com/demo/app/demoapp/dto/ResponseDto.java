package com.demo.app.demoapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto<T> {

    private String message;
    private Boolean status;
    private T data;

    public ResponseDto(Boolean status1,String message){
        this.setData(null);
        this.setMessage(message);
        this.setStatus(status1);
    }

    public ResponseDto(){

    }

    public ResponseDto withData(T data){
        this.setData(data);
        return this;
    }
}
