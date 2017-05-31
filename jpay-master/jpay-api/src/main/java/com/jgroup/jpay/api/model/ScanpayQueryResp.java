/**
 * 
 */
package com.jgroup.jpay.api.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author dockerking
 *
 */
@ApiModel
public class ScanpayQueryResp {

	@ApiModelProperty(value = "返回码", required = true, example = "", notes = "返回值(详见附录)")
	private String result;

	@ApiModelProperty(value = "返回码描述", required = false, example = "", notes = "错误码详见附录")
	private String desc;

	@ApiModelProperty(value = "外部订单号", required = false, example = "", notes = "当result返回0000时")
	private String outOrderNo;

	@ApiModelProperty(value = "平台方唯一交易请求流水号", required = true, example = "", notes = "平台方唯一交易请求流水号")
	private String orgTransId;

	@ApiModelProperty(value = "请求交易的流水号", required = true, example = "", notes = "请求交易的流水号")
	private String orgReqId;

	@ApiModelProperty(value = "商户订单号", required = true, example = "", notes = "商户订单号")
	private String orderNo;

	@ApiModelProperty(value = "商户操作员编号", required = false, example = "", notes = "商户操作员编号")
	private String operatorId;

	@ApiModelProperty(value = "币种", required = false, example = "CNY", notes = "币种，默认 CNY")
	private String currency;

	@ApiModelProperty(value = "支付渠道", required = false, example = "", notes = "支付渠道00：微信，01：支付宝，02：百付包，03翼支付，04：qq钱包")
	private String channelFlag;

	@ApiModelProperty(value = "MD5加密过的字符串", required = true, example = "", notes = "MD5加密过的字符串")
	private String signOut;

	@ApiModelProperty(value = "支付完成时间", required = false, example = "2017-04-13 13:45:35", notes = "2017-04-13 13:45:35")
	private String payTime;

	@ApiModelProperty(value = "订单金额", required = false, example = "", notes = "支付宝交易：totalAmount订单金额（单位元）")
	private String totalAmount;

	@ApiModelProperty(value = "实收金额", required = false, example = "", notes = "receiptAmount实收金额（单位元）")
	private String receiptAmount;

	@ApiModelProperty(value = "开票金额", required = false, example = "", notes = "invoiceAmount开票金额（单位元）")
	private String invoiceAmount;

	@ApiModelProperty(value = "付款金额", required = false, example = "", notes = "buyerPayAmount付款金额（单位元）")
	private String buyerPayAmount;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getOutOrderNo() {
		return outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOrgTransId() {
		return orgTransId;
	}

	public void setOrgTransId(String orgTransId) {
		this.orgTransId = orgTransId;
	}

	public String getOrgReqId() {
		return orgReqId;
	}

	public void setOrgReqId(String orgReqId) {
		this.orgReqId = orgReqId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
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

	public String getChannelFlag() {
		return channelFlag;
	}

	public void setChannelFlag(String channelFlag) {
		this.channelFlag = channelFlag;
	}

	public String getSignOut() {
		return signOut;
	}

	public void setSignOut(String signOut) {
		this.signOut = signOut;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getReceiptAmount() {
		return receiptAmount;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public String getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getBuyerPayAmount() {
		return buyerPayAmount;
	}

	public void setBuyerPayAmount(String buyerPayAmount) {
		this.buyerPayAmount = buyerPayAmount;
	}
}
