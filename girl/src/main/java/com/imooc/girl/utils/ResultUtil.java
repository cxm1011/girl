package com.imooc.girl.utils;

import com.imooc.girl.result.Result;

/**
 * Created by chen on 2017/7/18.
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("保存成功");
        result.setData(object);
        return result;
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(false);
        return result;
    }


}
