package com.fallen.parrot.controller.web;

import com.fallen.parrot.action.web.home.IndexAction;
import com.fallen.parrot.action.web.home.TestAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public String index(HttpServletRequest request) {
        IndexAction action = new IndexAction(request);
        return action.run();
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public String test(HttpServletRequest request) {
        TestAction action = new TestAction(request);
        return action.run();
    }
}
