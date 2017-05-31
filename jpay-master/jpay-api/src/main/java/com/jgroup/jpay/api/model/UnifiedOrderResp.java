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
public class UnifiedOrderResp {

	@ApiModelProperty(value = "返回码", required = true, example = "", notes = "返回值(详见附录)")
	private String result;

	@ApiModelProperty(value = "返回码描述", required = true, example = "", notes = "错误码详见附录")
	private String desc;

	@ApiModelProperty(value = "平台方唯一交易请求流水号", required = false, example = "", notes = "平台方唯一交易请求流水号")
	private String transId;

	@ApiModelProperty(value = "请求交易的流水号", required = false, example = "", notes = "请求交易的流水号（回传）")
	private String reqId;

	@ApiModelProperty(value = "商户订单号", required = false, example = "", notes = "商户订单号（回传）")
	private String orderNo;

	@ApiModelProperty(value = "二维码链接", required = false, example = "", notes = "渠道返回的二维码链接，可将该参数值生成二维码展示出来进行扫码支付")
	private String codeUrl;

	@ApiModelProperty(value = "MD5加密过的字符串", required = true, example = "", notes = "MD5加密过的字符串")
	private String signOut;

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

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getCodeUrl() {
		return codeUrl;
	}

	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

	public String getSignOut() {
		return signOut;
	}

	public void setSignOut(String signOut) {
		this.signOut = signOut;
	}
}
