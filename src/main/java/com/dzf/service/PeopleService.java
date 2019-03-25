package com.dzf.service;

import com.dzf.pojo.People;
import org.springframework.stereotype.Service;

public interface PeopleService {

    /**
     * 根据people信息去检查数据库是否存该用户
     * @param People
     * @return
     */

    People get(People people);
}
