package com.fallen.parrot.tool.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionTool {

    private HttpServletRequest request;
    private HttpSession session;

    public SessionTool(HttpServletRequest request) {
        this.request = request;
        session = request.getSession();
    }

    public HttpSession getSession() {
        return session;
    }

    public void setValue(String name, Object value) {
        getSession().setAttribute(name, value);
    }

    public Object getValue(String name){
        return getSession().getAttribute(name);
    }
}
