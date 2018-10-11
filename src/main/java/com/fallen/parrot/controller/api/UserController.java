package com.fallen.parrot.controller.api;

import com.fallen.parrot.action.api.user.IndexAction;
import com.fallen.parrot.action.api.user.TestAction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @RequestMapping(value = "" ,method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        IndexAction action = new IndexAction(request);
        return action.run();
    }

    @RequestMapping(value = "test" ,method = RequestMethod.GET)
    public String test(HttpServletRequest request) {
        TestAction action = new TestAction(request);
        return action.run();
    }
}
