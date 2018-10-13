package com.fallen.parrot.web.controller.web;

import com.fallen.parrot.web.action.web.home.IndexAction;
import com.fallen.parrot.web.action.web.home.TestAction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(HttpServletRequest request, Model model) {
        IndexAction action = new IndexAction(request, model);
        return action.run();
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public String test(HttpServletRequest request) {
        TestAction action = new TestAction(request);
        return action.run();
    }
}
