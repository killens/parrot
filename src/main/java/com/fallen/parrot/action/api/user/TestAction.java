package com.fallen.parrot.action.api.user;

import com.fallen.parrot.action.BaseAction;
import com.fallen.parrot.action.BaseActionServiceI;

import javax.servlet.http.HttpServletRequest;

public class TestAction extends BaseAction implements BaseActionServiceI {

    public TestAction(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String run() {
        return "test";
    }
}
