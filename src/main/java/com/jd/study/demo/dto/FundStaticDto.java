package com.jd.study.demo.dto;

import java.io.Serializable;

/**
 * @Author 会游泳的蚂蚁
 * @Description: 资产统计
 * @Date 2021/12/19 15:55
 */
public class FundStaticDto implements Serializable {


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long id;

    /**
     * 券商ID
     */
    private String brokerCode;
    /**
     * 券商名称
     */
    private String brokerName;
    /**
     * 统计日期
     */
    private int statisDay;
    /**
     * 入金金额
     */
    private double inGold;      
    /**
     * 入金用户数
     */
    private int inUserNum;   
    /**
     * 出金金额
     */
    private double outGold;     
    /**
     * 出金用户数
     */
    private int outUserNum;  
    /**
     * 累计入金
     */
    private double totalIn;     
    /**
     * 累计入金用户数
     */
    private int totalUser;   
    /**
     * 总资产
     */
    private double totalPropoty;

    public String getBrokerCode() {
        return brokerCode;
    }

    public void setBrokerCode(String brokerCode) {
        this.brokerCode = brokerCode;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public int getStatisDay() {
        return statisDay;
    }

    public void setStatisDay(int statisDay) {
        this.statisDay = statisDay;
    }

    public double getInGold() {
        return inGold;
    }

    public void setInGold(double inGold) {
        this.inGold = inGold;
    }

    public int getInUserNum() {
        return inUserNum;
    }

    public void setInUserNum(int inUserNum) {
        this.inUserNum = inUserNum;
    }

    public double getOutGold() {
        return outGold;
    }

    public void setOutGold(double outGold) {
        this.outGold = outGold;
    }

    public int getOutUserNum() {
        return outUserNum;
    }

    public void setOutUserNum(int outUserNum) {
        this.outUserNum = outUserNum;
    }

    public double getTotalIn() {
        return totalIn;
    }

    public void setTotalIn(double totalIn) {
        this.totalIn = totalIn;
    }

    public int getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(int totalUser) {
        this.totalUser = totalUser;
    }

    public double getTotalPropoty() {
        return totalPropoty;
    }

    public void setTotalPropoty(double totalPropoty) {
        this.totalPropoty = totalPropoty;
    }

    @Override
    public String toString() {
        return "FundStaticDto{" +
                "brokerCode='" + brokerCode + '\'' +
                ", brokerName='" + brokerName + '\'' +
                ", statisDay=" + statisDay +
                ", inGold=" + inGold +
                ", inUserNum=" + inUserNum +
                ", outGold=" + outGold +
                ", outUserNum=" + outUserNum +
                ", totalIn=" + totalIn +
                ", totalUser=" + totalUser +
                ", totalPropoty=" + totalPropoty +
                '}';
    }
}
