package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class helloRest {
//    @Value("${cupSize}")
//    private  String cupSize;

    @Autowired
    private GirlProperties girlProperties;

//    @GetMapping (value = {"/hello/{id}","/hi"})
//    public String hello(@PathVariable("id") Integer id){
//        return girlProperties.getCupSize()+girlProperties.getAge()+id;
//    }

//    @GetMapping (value = {"/hello","/hi"})
//    public String hello(@RequestParam(value="id",required=false,defaultValue = "11") Integer myId){
//        return girlProperties.getCupSize()+girlProperties.getAge()+myId;
//    }

    @GetMapping (value = {"/hello","/hi"})
    public String hello(@RequestParam(value="id",required=false,defaultValue = "11") Integer myId){
        return girlProperties.getCupSize()+girlProperties.getAge()+myId;
    }
}
