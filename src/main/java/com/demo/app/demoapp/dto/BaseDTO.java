package com.demo.app.demoapp.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class BaseDTO {

    private Date dateCreated;
    private Date lastUpdated;
    private String createdBy;
}
