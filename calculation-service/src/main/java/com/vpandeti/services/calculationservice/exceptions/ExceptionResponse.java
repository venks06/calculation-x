package com.vpandeti.services.calculationservice.exceptions;

public class ExceptionResponse {
    private int status;
    private String message;
    private String detail;

    public ExceptionResponse() {}

    public ExceptionResponse(int status, String message, String detail) {
        this.status = status;
        this.message = message;
        this.detail = detail;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
