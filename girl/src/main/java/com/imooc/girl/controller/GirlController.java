package com.imooc.girl.controller;

import com.imooc.girl.model.entity.GirlEntity;
import com.imooc.girl.model.json.GirlJson;
import com.imooc.girl.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
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

    @PostMapping(value = "/saveGirl")
    public boolean girlSave(@Valid  GirlEntity girlEntity, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return false;
        }
        return girlService.saveGirl(girlEntity);
    }
}
