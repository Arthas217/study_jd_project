package com.jd.study.demo.exception;

/**
 * @Author 会游泳的蚂蚁
 * @Description: 自定义异常类
 * @Date 2021/12/19 20:12
 */
public class ServiceException extends RuntimeException{

    public ServiceException(){
        super();
    }

    public ServiceException(String message){
        super(message);
    }


}
