package com.fallen.parrot.action;

import com.fallen.parrot.tool.http.SessionTool;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 基础处理Action
 */
public class BaseAction {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected Model model;
    protected SessionTool sessionTool;

    public BaseAction(HttpServletRequest request) {
        this.request = request;
    }

    public BaseAction(HttpServletRequest request, Model model) {
        this.request = request;
        this.model = model;
    }

    public BaseAction(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    public SessionTool getSessionTool() {
        if (sessionTool == null) {
            sessionTool = new SessionTool(request);
        }
        return sessionTool;
    }

}
