package com.jd.study.demo.action;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author 会游泳的蚂蚁
 * @Description: 控制层父类
 * @Date 2021/12/19 15:33
 */
public class BaseAction {

    /**
     * 返回状态码--成功
     */
    public static final int STATUS_SUCCESS = 200;
    /**
     * 返回状态码--错误
     */
    public static final int STATUS_ERROR = 500;


    protected void response(HttpServletResponse resp, int status, String message) throws IOException {
        this.response(resp, status, message, null);
    }


    /**
     * @param resp
     * @param status  状态码
     * @param message 提示消息
     * @param data    返回数据
     * @throws IOException
     */
    protected void response(HttpServletResponse resp, int status, String message, Object data) throws IOException {
        resp.setCharacterEncoding("UTF-8");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("resultCode", status);
        jsonObject.put("resultMsg", message);
        jsonObject.put("resultData", data);
        PrintWriter printWriter = resp.getWriter();
        printWriter.write(jsonObject.toString());
        printWriter.flush();
        printWriter.close();
    }

    /**
     * @param resp
     * @param jsonData  json字符串数据
     * @throws IOException
     */
    protected void response(HttpServletResponse resp, String jsonData) throws IOException {
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write(jsonData);
        writer.flush();
        writer.close();
    }


}
