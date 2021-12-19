package com.jd.study.demo.service.impl;

import com.jd.study.demo.exception.DataException;
import com.jd.study.demo.exception.ServiceException;
import com.jd.study.demo.mapper.DayFundMapper;
import com.jd.study.demo.dto.FundStaticDto;
import com.jd.study.demo.service.DayFundService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author 会游泳的蚂蚁
 * @Description:
 * @Date 2021/12/19 16:14
 */
@Service
public class DayFundServiceImpl implements DayFundService {

    private static Logger logger = LoggerFactory.getLogger(DayFundServiceImpl.class);

    @Resource
    DayFundMapper dayFundMapper;

    @Override
    public List<FundStaticDto> queryAssetsStaticInfo(Integer startTime, Integer endTime, String brokerCode) {
        List<FundStaticDto> dtoList;
        try {
            dtoList = dayFundMapper.queryAssetsInfo(startTime, endTime);
        } catch ( Exception e) {  // 注意自定义异常DataException时，catch必须用exception接收，否则抛出其他异常时，catch接收不到
            logger.error("查询日资产统计信息失败", e);
            throw new ServiceException("查询日资产统计信息失败");
        }
        return dtoList;
    }
}
