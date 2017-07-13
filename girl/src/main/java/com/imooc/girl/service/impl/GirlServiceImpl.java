package com.imooc.girl.service.impl;

import com.imooc.girl.mapper.GirlMapper;
import com.imooc.girl.model.json.GirlJson;
import com.imooc.girl.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chen on 2017/7/12.
 */
@Service
public class GirlServiceImpl implements GirlService{
    @Autowired
    private GirlMapper girlMapper;
    @Override
    public List<GirlJson> queryGirl() {
        return girlMapper.queryGirl();
    }
}
