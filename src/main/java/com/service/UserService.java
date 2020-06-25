package com.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.Map;

public interface UserService {
    Page getUserList(Map map);
}
