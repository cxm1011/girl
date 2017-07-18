package com.imooc.girl.controller;

import com.imooc.girl.aspect.HttpAspect;
import com.imooc.girl.model.entity.GirlEntity;
import com.imooc.girl.model.json.GirlJson;
import com.imooc.girl.result.Result;
import com.imooc.girl.service.GirlService;
import com.imooc.girl.utils.ResultUtil;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    private final static Logger logger = LoggerFactory.getLogger(GirlController.class);

    @GetMapping(value = "/queryGirl")
    public List<GirlJson> girlList(){
        logger.info("girlList");
        return girlService.queryGirl();
    }

    @GetMapping(value = "/queryAge/{id}")
    public Integer queryAge(@PathVariable("id") Integer id){
        return girlService.queryGirlAgeById(id);
    }

    @PostMapping(value = "/saveGirl")
    public Result<Boolean> girlSave(@Valid  GirlEntity girlEntity, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtil.success(true);
    }
}
