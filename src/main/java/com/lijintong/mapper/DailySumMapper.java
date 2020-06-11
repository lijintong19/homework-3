package com.lijintong.mapper;

import com.lijintong.model.DailySum;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface DailySumMapper {

    List<DailySum> queryAll();

    DailySum queryDailySumById(int id);

    int addDailySum(DailySum dailySum);

    int updateDailySum(DailySum dailySum);

    int deleteDailySum(int id);
}
