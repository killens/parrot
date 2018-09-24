package com.fallen.parrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping("/")
public class TestController {

    @RequestMapping("test/session")
    public String getSessionId(HttpServletRequest request) {
        Object content = request.getSession().getAttribute("springboot");
        if (content == null) {
            request.getSession().setAttribute("springboot", "1234567");
        } else {
            request.getSession().setAttribute("springboot", new Date().toString());
        }
        return "port:"+request.getLocalPort() + " sessionId=" + request.getSession().getId() + "<br/>" + content;
    }
}
