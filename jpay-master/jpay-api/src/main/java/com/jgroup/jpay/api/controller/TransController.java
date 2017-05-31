/**
 * 
 */
package com.jgroup.jpay.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jgroup.jpay.api.model.ScanpayQueryResp;
import com.jgroup.jpay.api.model.UnifiedOrderReq;
import com.jgroup.jpay.api.model.UnifiedOrderResp;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author dockerking
 *
 */

@RestController
@RequestMapping(value = "/jpay/api")
@Api(value = "apis",description="交易服务接口")
public class TransController {

	/**
	 * 预统一下单2.0
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "unifiedOrder", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "预统一下单2.0", notes = "")
	public @ResponseBody UnifiedOrderResp unifiedOrder(@RequestBody UnifiedOrderReq req) {
		UnifiedOrderResp resp = new UnifiedOrderResp();
		// TODO
		return resp;
	}

	/**
	 * 预统一结果查询2.0
	 * 
	 * @return
	 */
	@RequestMapping(value = "scanpayQuery", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "预统一结果查询2.0", notes = "")
	public @ResponseBody ScanpayQueryResp scanpayQuery(
			@ApiParam(name = "merNo", value = "商户号", required = true) String merNo,
			@ApiParam(name = "orderNo", value = "商户订单号", required = false) String orderNo,
			@ApiParam(name = "termNo", value = "终端编码", required = false) String termNo,
			@ApiParam(name = "orgTransId", value = "平台方唯一交易请求流水号", required = false) String orgTransId,
			@ApiParam(name = "orgReqId", value = "原始请求交易流水号", required = false) String orgReqId,
			@ApiParam(name = "signIn", value = "MD5加密过的字符串", required = true) String signIn) {
		ScanpayQueryResp resp = new ScanpayQueryResp();
		// TODP
		return resp;
	}
}
