package com.imooc.girl.service;

import com.imooc.girl.model.entity.GirlEntity;
import com.imooc.girl.model.json.GirlJson;

import java.util.List;

/**
 * Created by chen on 2017/7/12.
 */
public interface GirlService {
    List<GirlJson> queryGirl();

    void  queryGirlAgeById(int id) throws Exception;

    boolean saveGirl(GirlEntity girlEntity);
}
