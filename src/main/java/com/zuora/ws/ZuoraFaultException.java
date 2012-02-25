package com.zuora.ws;

import javax.xml.namespace.QName;

import com.sforce.ws.ConnectionException;

public class ZuoraFaultException extends ConnectionException {

	private static final long serialVersionUID = 6727192150757263283L;
	private QName faultCode;
	private String message;
	
	public ZuoraFaultException() {
	}
	
	public ZuoraFaultException(QName faultCode, String msg) {
		super(msg);
		this.faultCode = faultCode;
	}
	
	public ZuoraFaultException(QName faultCode, String msg, Throwable cause) {
		super(msg, cause);
		this.faultCode = faultCode;
	}

	public void setZFaultCode(QName code) {
		this.faultCode = code;
	}

	public QName getZFaultCode() {
		return faultCode;
	}
	
	public String getFaultMessage() {
		return message;
	}

	public void setFaultMessage(String msg) {
		this.message = msg;
	}
}
