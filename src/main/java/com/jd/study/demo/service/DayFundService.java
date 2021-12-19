package com.jd.study.demo.service;

import com.jd.study.demo.dto.FundStaticDto;
import com.jd.study.demo.exception.ServiceException;

import java.util.List;

/**
 * @Author 会游泳的蚂蚁
 * @Description: 日资产统计
 * @Date 2021/12/19 15:52
 */
public interface DayFundService {


    /**
     * 查询资产统计信息
     * @param startTime
     * @param endTime
     * @param brokerCode
     * @return
     * @throws Exception
     */
    List<FundStaticDto> queryAssetsStaticInfo(Integer startTime,Integer endTime,String brokerCode) throws ServiceException;
}
