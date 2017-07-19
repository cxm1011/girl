package com.imooc.girl;

import com.imooc.girl.mapper.GirlMapper;
import com.imooc.girl.model.json.GirlJson;
import com.imooc.girl.service.GirlService;
import org.hibernate.validator.internal.constraintvalidators.bv.past.PastValidatorForReadableInstant;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by chen on 2017/7/19.
 */
@RunWith(SpringRunner.class)  //表示在测试环境跑 底层使用junit
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private GirlMapper girlMapper;
    @Autowired
    private GirlService girlService;

    @Test
    public void  queryGirl(){
        List<GirlJson> girlJsons =  girlMapper.queryGirl();
    }
}
