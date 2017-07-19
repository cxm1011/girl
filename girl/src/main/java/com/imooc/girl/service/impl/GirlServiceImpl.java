package com.imooc.girl.service.impl;

import com.imooc.girl.enums.ResultEnum;
import com.imooc.girl.exception.GirlException;
import com.imooc.girl.mapper.GirlMapper;
import com.imooc.girl.model.entity.GirlEntity;
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

    @Override
    public void queryGirlAgeById(int id) throws Exception {
        int age = girlMapper.queryGirlAgeById(id);
        if(age < 10){
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }
        else  if(age > 10 && age < 16){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    @Override
    public boolean saveGirl(GirlEntity girlEntity) {
         girlMapper.saveGirl(girlEntity);
         return true;
    }
}
