package com.dzf.service.imp;

import com.dzf.mapper.PeopleMapper;
import com.dzf.pojo.People;
import com.dzf.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("peopleService")
public class PeopleServiceImp1 implements PeopleService {

    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public People get(People people) {

        return peopleMapper.select(people);
    }


}
