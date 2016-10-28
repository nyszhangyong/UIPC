package com.util;

public class ObjectMessage {

	//用来存储成功或者失败标记，无需指定，根据调用方法自动设置
    private Boolean success = false;
    //用来存储成功或者失败信息
    private String message = "";
    //如果返回的是查询列表，则存储查询列表的分页信息
    private Page page;
    //存储返回的对象（可以是对象LIST）
    private Object data;

    public static ObjectMessage success(String message, Object object,Page page) {
        ObjectMessage messageObject = new ObjectMessage();
        messageObject.setSuccess(true);
        messageObject.setMessage(message);
        messageObject.setPage(page);
        messageObject.setData(object);
        return messageObject;
    }

    public static ObjectMessage error(String message, Object object,Page page) {
        ObjectMessage messageObject = new ObjectMessage();
        messageObject.setSuccess(false);
        messageObject.setMessage(message);
        messageObject.setPage(page);
        messageObject.setData(object);
        return messageObject;
    }

    public static ObjectMessage error(String message){
        ObjectMessage messageObject = new ObjectMessage();
        messageObject.setSuccess(false);
        messageObject.setMessage(message);
        messageObject.setPage(null);
        messageObject.setData("");
        return messageObject;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
