package com.util;

public class ObjectMessage {

    private Boolean success = false;
    private String message = "";
    private Object data;

    public static ObjectMessage success(String message, Object object) {
        ObjectMessage messageObject = new ObjectMessage();
        messageObject.setSuccess(true);
        messageObject.setMessage(message);
        messageObject.setData(object);
        return messageObject;
    }

    public static ObjectMessage error(String message, Object object) {
        ObjectMessage messageObject = new ObjectMessage();
        messageObject.setSuccess(false);
        messageObject.setMessage(message);
        messageObject.setData(object);
        return messageObject;
    }

    public static ObjectMessage error(String message){
        ObjectMessage messageObject = new ObjectMessage();
        messageObject.setSuccess(false);
        messageObject.setMessage(message);
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
