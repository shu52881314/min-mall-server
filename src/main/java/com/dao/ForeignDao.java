package com.dao;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface ForeignDao {
    @Select("select id,image,title,price from t_commodity")
    IPage<Map> getCommodityList(Page page, Map map);
    @Select("select id,src from t_carousel_info order by no desc")
    List<Map> getCarouselList(Map map);
    @Select("select id,name,pid,picture,type from t_cate")
    List<Map> getCateList(Map map);
}
