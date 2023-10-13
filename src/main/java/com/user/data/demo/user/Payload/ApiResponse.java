package com.user.data.demo.user.Payload;

//import java.util.Date;

public class ApiResponse {
	
	private String message;
	private boolean scccess;
	
//	private Date timestamp;
//    private String messagee;
//    private String details;
//
//    public ApiResponse(Date timestamp, String messagee, String details) {
//        this.timestamp = timestamp;
//        this.messagee = messagee;
//        this.details = details;
//    }
//
//    public Date getTimestamp() {
//        return timestamp;
//    }
//
//    public String getMessagee() {
//        return messagee;
//    }
//
//    public String getDetails() {
//        return details;
//    }

	
	
	public ApiResponse(String message, boolean scccess) {
		super();
		this.message = message;
		this.scccess = scccess;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getScccess() {
		return scccess;
	}
	public void setScccess(Boolean scccess) {
		this.scccess = scccess;
	}
	 
}
