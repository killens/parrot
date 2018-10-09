package com.fallen.parrot.action.test.session;

import com.fallen.parrot.action.BaseAction;
import com.fallen.parrot.action.BaseActionServiceI;
import com.fallen.parrot.tool.http.SessionTool;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public class IndexAction extends BaseAction implements BaseActionServiceI {

    public IndexAction(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String run() {
        SessionTool sessionTool = getSessionTool();
        Object content = sessionTool.getValue("springboot");
        if (content == null) {
            sessionTool.setValue("springboot", "1234567");
        } else {
            sessionTool.setValue("springboot", new Date().toString());
        }
        return "port:"+request.getLocalPort() + " sessionId=" + sessionTool.getSession().getId() + "<br/>" + content;
    }
}
