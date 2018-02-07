package com.demo.app.demoapp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Blog extends BaseDTO{

    private String title;
    private String description;
    private Date datePublished;

    public static Blog initiate(String title){
        Blog blog = new Blog();
        blog.setTitle(title);
        blog.setDescription("");
        blog.setDatePublished(new Date());
        blog.setDateCreated(new Date());
        blog.setLastUpdated(new Date());
        blog.setCreatedBy("Admin");
        return blog;
    }

}
