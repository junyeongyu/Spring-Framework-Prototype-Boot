package com.junyeong.yu.prototype.boot;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String index() {
        return "{name: \"Hello World!\"}";
    }

    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        return "{name: \"Hello World!\"}";
    }
}