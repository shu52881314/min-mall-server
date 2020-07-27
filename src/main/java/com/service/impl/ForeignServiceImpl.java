package com.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dao.ForeignDao;
import com.service.ForeignService;
import com.util.MapData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class ForeignServiceImpl implements ForeignService {
    @Autowired
    ForeignDao foreignDao;

    @Override
    public Map getCommodityList(Map map) {
        Long pageNo=Long.parseLong(map.get("pageNo").toString());
        Long pageSize=Long.parseLong(map.get("pageSize").toString());
        Page<Map> page = new Page<>(pageNo,pageSize);
        IPage<Map> iPage=this.foreignDao.getCommodityList(page,map);
        return MapData.of(iPage.getRecords());
    }

    @Override
    public Map getCarouselList(Map map) {
        return MapData.of(this.foreignDao.getCarouselList(map));
    }

    @Override
    public Map getCateList(Map map) {
        return MapData.of(this.foreignDao.getCateList(map));
    }
}
