package com.dzf.service.imp;

import com.dzf.mapper.NewsDetailMapper;
import com.dzf.pojo.NewsDetail;
import com.dzf.service.NewsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("newsDetailService")
public class NewsDetailServiceImp implements NewsDetailService {

    @Autowired
    private NewsDetailMapper newsDetailMapper;

    @Override
    public List<NewsDetail> queryAll() {

        return newsDetailMapper.quaryAll();
    }

    @Override
    public List<NewsDetail> queryByTitle(String title) {

        return newsDetailMapper.queryByTitle(title);
    }
}
