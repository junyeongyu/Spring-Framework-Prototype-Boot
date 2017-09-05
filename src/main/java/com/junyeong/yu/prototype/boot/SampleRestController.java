package com.junyeong.yu.prototype.boot;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sample/api")
public class SampleRestController {

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "{name: \"Hello World!\"}";
    }
}