package com.jd.study.demo.mapper;

import com.jd.study.demo.dto.FundStaticDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 会游泳的蚂蚁
 * @Description:
 * @Date 2021/12/19 16:17
 */
@Mapper
public interface DayFundMapper {

    /**
     * 查询资产信息
     * @param startTime
     * @param endTime
     * @return
     * @throws Exception
     */
    List<FundStaticDto> queryAssetsInfo(@Param("startTime") Integer startTime, @Param("endTime")Integer endTime) throws Exception;

}
