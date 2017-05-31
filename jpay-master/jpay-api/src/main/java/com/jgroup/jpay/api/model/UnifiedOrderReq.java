/**
 * 
 */
package com.jgroup.jpay.api.model;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 正扫（B扫C）请求报文
 * 
 * @author dockerking
 *
 */
@ApiModel
public class UnifiedOrderReq {

	@NotNull(message="{jpay.api.unifiedorderreq.merNo.NOT_NULL}")
	@Size(min=1,max=15,message="{jpay.api.unifiedorderreq.merNo.SIZE_OVER}")
	@ApiModelProperty(value = "商户号", required = true, example = "", notes = "商户号")
	private String merNo;

	@ApiModelProperty(value = "商户订单号", required = true, example = "", notes = "商户订单号,同一商户号和终端号下唯一")
	private String orderNo;

	@ApiModelProperty(value = "支付通道", required = true, example = "", notes = "支付渠道00：微信，01：支付宝，02：百付包，03翼支付,04:qq，05:京东")
	private String channelFlag;

	@ApiModelProperty(value = "终端编码", required = false, example = "", notes = "终端编码")
	private String termNo;

	@ApiModelProperty(value = "MD5加密过的字符串", required = true, example = "", notes = "MD5加密过的字符串")
	private String signIn;

	@ApiModelProperty(value = "异步通知url", required = false, example = "", notes = "异步通知url需要设置白名单")
	private String notifyUrl;

	@ApiModelProperty(value = "商品名", required = false, example = "", notes = "商品名")
	private String goodsName;

	@ApiModelProperty(value = "订单金额", required = true, example = "", notes = "单位为分")
	private BigDecimal amount;

	@ApiModelProperty(value = "请求交易的流水号", required = true, example = "", notes = "请求交易的流水号，同一商户号和终端号下唯一")
	private String reqId;

	@ApiModelProperty(value = "请求时间，格式:YYYYMMDDhhmmss", required = true, example = "20170421121000", notes = "请求时间，格式: YYYYMMDDhhmmss")
	private String reqTime;

	@ApiModelProperty(value = "商户操作员编码", required = false, example = "", notes = "商户操作员编号")
	private String operatorId;

	@ApiModelProperty(value = "币种", required = false, example = "CNY", notes = "币种，默认 CNY")
	private String currency;

	@ApiModelProperty(value = "API版本号", required = true, allowableValues = "1.0,2.0", example = "2.0", notes = "接口版本号")
	private String apiVersion;

	public String getMerNo() {
		return merNo;
	}

	public void setMerNo(String merNo) {
		this.merNo = merNo;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getChannelFlag() {
		return channelFlag;
	}

	public void setChannelFlag(String channelFlag) {
		this.channelFlag = channelFlag;
	}

	public String getTermNo() {
		return termNo;
	}

	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}

	public String getSignIn() {
		return signIn;
	}

	public void setSignIn(String signIn) {
		this.signIn = signIn;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getReqTime() {
		return reqTime;
	}

	public void setReqTime(String reqTime) {
		this.reqTime = reqTime;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}
}
