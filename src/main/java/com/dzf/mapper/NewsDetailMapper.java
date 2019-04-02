package com.dzf.mapper;

import com.dzf.pojo.NewsDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsDetailMapper {
    List<NewsDetail> quaryAll();

    List<NewsDetail> queryByTitle(@Param("title")String title);
}
