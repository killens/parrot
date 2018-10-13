package com.fallen.parrot.tool.convertor;

import com.alibaba.fastjson.JSONObject;
import com.fallen.parrot.tool.convertor.response.ResponseModel;

public class JsonTool {

    /**
     * 对象转化为json
     * @param object
     * @return
     */
    public static String toJson(Object object) {
        return JSONObject.toJSONString(object);
    }

    /**
     * json转换对象
     * @param json
     * @param className
     * @param <T>
     * @return
     */
    public static <T> T parse(String json, Class<T> className) {
        return JSONObject.parseObject(json, className);
    }

    /**
     * 转换为标准的response model
     * @param json
     * @return
     */
    public static ResponseModel parse(String json) {
        return parse(json, ResponseModel.class);
    }
}
