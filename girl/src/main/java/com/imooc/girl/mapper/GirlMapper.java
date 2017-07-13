package com.imooc.girl.mapper;

import com.imooc.girl.model.json.GirlJson;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by chen on 2017/7/10.
 */
@Mapper
public interface GirlMapper {

    List<GirlJson> queryGirl();
}
