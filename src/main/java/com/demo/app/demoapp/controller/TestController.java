package com.demo.app.demoapp.controller;

import com.demo.app.demoapp.dto.Blog;
import com.demo.app.demoapp.dto.ResponseDto;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CommonsLog
public class TestController {

    @GetMapping(value = "/test")
    public String test() {
        return "Test successful.";
    }

    @GetMapping(value = "/blog")
    public ResponseDto<Blog> getBlog(@RequestParam String title){
        log.info("In side /blog with title ..... "+title);
        ResponseDto<Blog>  responseDto= new ResponseDto<>(true,"Success");
        return responseDto.withData(Blog.initiate(title));
    }

    @GetMapping(value = "/blog/list")
    public ResponseDto<List<Blog>> getBlogList(){
        log.info("In side /blog with List ..... ");
        ResponseDto<List<Blog>>  responseDto= new ResponseDto<>(true,"Success");
        return responseDto.withData(Arrays.asList(Blog.initiate("blog1"),
                                                  Blog.initiate("blog2"),
                                                  Blog.initiate("blog3"),
                                                  Blog.initiate("blog4"),
                                                  Blog.initiate("blog5"),
                                                  Blog.initiate("blog6"),
                                                  Blog.initiate("blog7"),
                                                  Blog.initiate("blog8"),
                                                  Blog.initiate("blog9"),
                                                  Blog.initiate("blog10")));
    }
}
