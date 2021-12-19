package com.jd.study.demo.action;

import com.jd.study.demo.dto.FundStaticDto;
import com.jd.study.demo.exception.ServiceException;
import com.jd.study.demo.service.DayFundService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author 会游泳的蚂蚁
 * @Description: 资产统计
 * @Date 2021/12/19 15:47
 */
@Controller
@RequestMapping(value = "/assets")
public class AssetsInfoAciton extends BaseAction {

    private static Logger log = LoggerFactory.getLogger(AssetsInfoAciton.class);

    @Resource
    private DayFundService dayFundService;

    /**
     * 查询资产统计
     *
     * @param resp
     * @param startTime
     * @param endTime
     * @param brokerCode
     * @throws IOException
     */
    @RequestMapping(value = "/queryAssets", method = RequestMethod.GET)
    @ResponseBody
    public void queryAsserts(HttpServletResponse resp, Integer startTime, Integer endTime, String brokerCode) throws IOException {
        if (startTime == null) {
            super.response(resp, STATUS_ERROR, "开始时间不能为空，重新选择");
            return;
        }
        if (endTime == null) {
            super.response(resp, STATUS_ERROR, "结束时间不能为空，重新选择");
            return;
        }
        try {
            List<FundStaticDto> list = dayFundService.queryAssetsStaticInfo(startTime, endTime, brokerCode);
            super.response(resp, STATUS_SUCCESS, "查询成功", list);
        } catch (ServiceException e) {
            log.error("查询资产统计失败发生异常", e);
            super.response(resp, STATUS_ERROR, "查询失败");
        }
    }
}
