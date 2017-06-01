package com.duan.idebugging.weixin.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by xiangdong.duan on 2017/6/1.
 */

@XStreamAlias("xml")
public class WxPayOrderResult {

    @XStreamAlias("return_code")
    private String returnCode;
    @XStreamAlias("return_msg")
    private String returnMsg;
    @XStreamAlias("appid")
    private String appid;
    @XStreamAlias("mch_id")
    private String merchantId;
    @XStreamAlias("device_info")
    private String deviceInfo;
    @XStreamAlias("nonce_str")
    private String nonceStr;
    @XStreamAlias("sign")
    private String sign;
    @XStreamAlias("result_code")
    private String resultCode;
    @XStreamAlias("err_code")
    private String errCode;
    @XStreamAlias("err_code_des")
    private String errCodeDes;
    @XStreamAlias("trade_type")
    private String tradeType;
    @XStreamAlias("prepay_id")
    private String prepayId;
    @XStreamAlias("err_msg")
    private String errMsg;
    @XStreamAlias("code_url")
    private String codeUrl;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WxPayOrderResult{");
        sb.append("returnCode='").append(returnCode).append('\'');
        sb.append(", returnMsg='").append(returnMsg).append('\'');
        sb.append(", appid='").append(appid).append('\'');
        sb.append(", merchantId='").append(merchantId).append('\'');
        sb.append(", deviceInfo='").append(deviceInfo).append('\'');
        sb.append(", nonceStr='").append(nonceStr).append('\'');
        sb.append(", sign='").append(sign).append('\'');
        sb.append(", resultCode='").append(resultCode).append('\'');
        sb.append(", errCode='").append(errCode).append('\'');
        sb.append(", errCodeDes='").append(errCodeDes).append('\'');
        sb.append(", tradeType='").append(tradeType).append('\'');
        sb.append(", prepayId='").append(prepayId).append('\'');
        sb.append(", errMsg='").append(errMsg).append('\'');
        sb.append(", codeUrl='").append(codeUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrCodeDes() {
        return errCodeDes;
    }

    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }
}
