package com.fallen.parrot.controller.web;

import com.fallen.parrot.action.web.home.IndexAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
        public String index(HttpServletRequest request) {
        IndexAction action = new IndexAction(request);
        return action.run();
    }
}
