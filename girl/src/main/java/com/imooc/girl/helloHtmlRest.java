package com.imooc.girl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by chen on 2017/9/27.
 */
@Controller
public class helloHtmlRest {
    @RequestMapping(value="/htmlHello")
    public String showMockList(Map<String,Object> map){
        map.put("hello","宝贝，我爱你!");
        return "/helloBootstrape";
    }
}
