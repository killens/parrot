package com.fallen.parrot.controller.test;

import com.fallen.parrot.action.test.session.IndexAction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class TestController {

    @RequestMapping("test/session")
    public String getSessionId(HttpServletRequest request) {
        IndexAction processAction = new IndexAction(request);
        return processAction.run();
    }
}
