package com.fallen.parrot.tool.convertor.response;

import java.util.HashMap;
import java.util.Map;

public class ResponseModel {

    private int code;
    private String msg;
    private Map<String, String> data;

    protected Map<String, String> emptyData() {
        return new HashMap<String, String>();
    }

    public ResponseModel() {
        initModel(500);
    }

    public ResponseModel(String msg) {
        initModel(500, msg);
    }

    public ResponseModel(int code, String msg) {
        initModel(code, msg);
    }

    public void initModel(int code, String msg, Map<String, String> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public void initModel(int code, String msg) {
        initModel(code, msg, emptyData());
    }

    public void initModel(int code) {
        initModel(code, "", emptyData());
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public void setDataValue(String key, String value) {
        data.put(key, value);
    }
}
