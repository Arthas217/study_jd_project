package com.jd.study.demo.dto;

/**
 * @Author 会游泳的蚂蚁
 * @Description:
 * @Date 2021/12/19 16:47
 */
public class DayFund {

    //数据库主键
    private long id;

    // 账号
    private long accountId;

    // 资金账号
    private String fundAccount;

    // 资金余额
    private double fundBalance;

    // 可用金额
    private double availFund;

    //冻结金额
    private double frozenFund;

    // 日期
    private int calDate;

    // 转移金额
    private double transferFund;

    //股票市值
    private double stkMktValue;

    //日收益率
    private double dayProfitRatio;

    //周收益率
    private double weekProfitRatio;

    //月收益率
    private double monthProfitRatio;

    //年收益率
    private double yearProfitRatio;

    //总收益率
    private double totalProfitRatio;

    //基金净值
    private double fundNetValue;

    //基金份数
    private double fundShareCount;

    //利息收入
    private double fundInterest;

    //新股申购金额（2016年前考虑）
    private double newPurchaseAmount;

    //国债逆回购金额
    private double bondReverseRepurchaseAmount;

    // 转托管入金额
    private double transferIntoTheTubesAmount;

    //基金赎回未到账金额
    private double fundRedemptionBalanceUnarrived;

    //红利金额
    private double bonusAmount;

    // 新股出入金额
    private double newStockTransferFund;

    // 排除新股的基金净值
    private double fundNetValueWithoutNewStock = 1;

    // 排除新股的基金份数
    private double fundShareCountWithoutNewStock;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getFundAccount() {
        return fundAccount;
    }

    public void setFundAccount(String fundAccount) {
        this.fundAccount = fundAccount;
    }

    public double getFundBalance() {
        return fundBalance;
    }

    public void setFundBalance(double fundBalance) {
        this.fundBalance = fundBalance;
    }

    public double getAvailFund() {
        return availFund;
    }

    public void setAvailFund(double availFund) {
        this.availFund = availFund;
    }

    public double getFrozenFund() {
        return frozenFund;
    }

    public void setFrozenFund(double frozenFund) {
        this.frozenFund = frozenFund;
    }

    public int getCalDate() {
        return calDate;
    }

    public void setCalDate(int calDate) {
        this.calDate = calDate;
    }

    public double getTransferFund() {
        return transferFund;
    }

    public void setTransferFund(double transferFund) {
        this.transferFund = transferFund;
    }

    public double getStkMktValue() {
        return stkMktValue;
    }

    public void setStkMktValue(double stkMktValue) {
        this.stkMktValue = stkMktValue;
    }

    public double getDayProfitRatio() {
        return dayProfitRatio;
    }

    public void setDayProfitRatio(double dayProfitRatio) {
        this.dayProfitRatio = dayProfitRatio;
    }

    public double getWeekProfitRatio() {
        return weekProfitRatio;
    }

    public void setWeekProfitRatio(double weekProfitRatio) {
        this.weekProfitRatio = weekProfitRatio;
    }

    public double getMonthProfitRatio() {
        return monthProfitRatio;
    }

    public void setMonthProfitRatio(double monthProfitRatio) {
        this.monthProfitRatio = monthProfitRatio;
    }

    public double getYearProfitRatio() {
        return yearProfitRatio;
    }

    public void setYearProfitRatio(double yearProfitRatio) {
        this.yearProfitRatio = yearProfitRatio;
    }

    public double getTotalProfitRatio() {
        return totalProfitRatio;
    }

    public void setTotalProfitRatio(double totalProfitRatio) {
        this.totalProfitRatio = totalProfitRatio;
    }

    public double getFundNetValue() {
        return fundNetValue;
    }

    public void setFundNetValue(double fundNetValue) {
        this.fundNetValue = fundNetValue;
    }

    public double getFundShareCount() {
        return fundShareCount;
    }

    public void setFundShareCount(double fundShareCount) {
        this.fundShareCount = fundShareCount;
    }

    public double getFundInterest() {
        return fundInterest;
    }

    public void setFundInterest(double fundInterest) {
        this.fundInterest = fundInterest;
    }

    public double getNewPurchaseAmount() {
        return newPurchaseAmount;
    }

    public void setNewPurchaseAmount(double newPurchaseAmount) {
        this.newPurchaseAmount = newPurchaseAmount;
    }

    public double getBondReverseRepurchaseAmount() {
        return bondReverseRepurchaseAmount;
    }

    public void setBondReverseRepurchaseAmount(double bondReverseRepurchaseAmount) {
        this.bondReverseRepurchaseAmount = bondReverseRepurchaseAmount;
    }

    public double getTransferIntoTheTubesAmount() {
        return transferIntoTheTubesAmount;
    }

    public void setTransferIntoTheTubesAmount(double transferIntoTheTubesAmount) {
        this.transferIntoTheTubesAmount = transferIntoTheTubesAmount;
    }

    public double getFundRedemptionBalanceUnarrived() {
        return fundRedemptionBalanceUnarrived;
    }

    public void setFundRedemptionBalanceUnarrived(double fundRedemptionBalanceUnarrived) {
        this.fundRedemptionBalanceUnarrived = fundRedemptionBalanceUnarrived;
    }

    public double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public double getNewStockTransferFund() {
        return newStockTransferFund;
    }

    public void setNewStockTransferFund(double newStockTransferFund) {
        this.newStockTransferFund = newStockTransferFund;
    }

    public double getFundNetValueWithoutNewStock() {
        return fundNetValueWithoutNewStock;
    }

    public void setFundNetValueWithoutNewStock(double fundNetValueWithoutNewStock) {
        this.fundNetValueWithoutNewStock = fundNetValueWithoutNewStock;
    }

    public double getFundShareCountWithoutNewStock() {
        return fundShareCountWithoutNewStock;
    }

    public void setFundShareCountWithoutNewStock(double fundShareCountWithoutNewStock) {
        this.fundShareCountWithoutNewStock = fundShareCountWithoutNewStock;
    }

    @Override
    public String toString() {
        return "DayFund{" +
                "id=" + id +
                ", accountId=" + accountId +
                ", fundAccount='" + fundAccount + '\'' +
                ", fundBalance=" + fundBalance +
                ", availFund=" + availFund +
                ", frozenFund=" + frozenFund +
                ", calDate=" + calDate +
                ", transferFund=" + transferFund +
                ", stkMktValue=" + stkMktValue +
                ", dayProfitRatio=" + dayProfitRatio +
                ", weekProfitRatio=" + weekProfitRatio +
                ", monthProfitRatio=" + monthProfitRatio +
                ", yearProfitRatio=" + yearProfitRatio +
                ", totalProfitRatio=" + totalProfitRatio +
                ", fundNetValue=" + fundNetValue +
                ", fundShareCount=" + fundShareCount +
                ", fundInterest=" + fundInterest +
                ", newPurchaseAmount=" + newPurchaseAmount +
                ", bondReverseRepurchaseAmount=" + bondReverseRepurchaseAmount +
                ", transferIntoTheTubesAmount=" + transferIntoTheTubesAmount +
                ", fundRedemptionBalanceUnarrived=" + fundRedemptionBalanceUnarrived +
                ", bonusAmount=" + bonusAmount +
                ", newStockTransferFund=" + newStockTransferFund +
                ", fundNetValueWithoutNewStock=" + fundNetValueWithoutNewStock +
                ", fundShareCountWithoutNewStock=" + fundShareCountWithoutNewStock +
                '}';
    }
}
