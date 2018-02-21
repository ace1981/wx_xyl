package com.platform.dto;

import java.io.Serializable;
/**
 * 作�??: @author jn <br>
 * 时间: 2018-02-18 10:32<br>
 * 描述: 返回統一對象 <br>
 */
public class Result implements Serializable{
	 

	public String ret=ResultStatus.OK;
	public String msg="执行成功";
	public Object data=null;
	
	public static Result ok(Object data)
	{
		Result r = new Result();
		r.setRet(ResultStatus.OK);
		r.setMsg("执行成功");
		r.setData(data);
		return r;
	}
	
	public static Result error(String msg)
	{
		Result r = new Result();
		r.setRet(ResultStatus.ERROR);
		r.setMsg(msg);		
		return r;
	}
	public static Result error(Object data)
	{
		Result r = new Result();
		r.setRet(ResultStatus.ERROR);
		r.setMsg("执行失败");
		r.setData(data);
		return r;
	}
	
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getRet() {
		return ret;
	}
	public void setRet(String ret) {
		this.ret = ret;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
