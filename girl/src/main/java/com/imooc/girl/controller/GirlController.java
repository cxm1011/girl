package com.imooc.girl.controller;

import com.imooc.girl.model.json.GirlJson;
import com.imooc.girl.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chen on 2017/7/12.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlService girlService;

    @GetMapping(value = "/queryGirl")
    public List<GirlJson> girlList(){
        return girlService.queryGirl();
    }
}
