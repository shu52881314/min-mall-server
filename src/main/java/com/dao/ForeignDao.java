package com.dao;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public interface ForeignDao {
    @Select("select id,image,title,price from t_commodity")
    Page<Map> getCommodityList(Page page,Map map);
}
