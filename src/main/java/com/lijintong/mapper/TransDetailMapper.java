package com.lijintong.mapper;

import com.lijintong.model.TransDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TransDetailMapper {

    List<TransDetail> queryTransDetail();

    TransDetail queryTransDetailById(int id);

    int addTransDetail(TransDetail transDetail);

    int updateTransDetail(TransDetail transDetail);

    int deleteTransDetail(int id);
}
