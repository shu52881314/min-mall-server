package com.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;
import java.util.Map;

public interface ForeignService {
    Map getCommodityList(Map map);

    Map getCarouselList(Map map);

    Map getCateList(Map map);
}
