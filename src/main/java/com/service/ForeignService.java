package com.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.Map;

public interface ForeignService {
    Map getCommodityList(Map map);
}
