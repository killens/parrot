package com.fallen.parrot.action.web.home;

import com.fallen.parrot.action.BaseAction;
import com.fallen.parrot.action.BaseActionServiceI;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

public class IndexAction extends BaseAction implements BaseActionServiceI {

    public IndexAction(HttpServletRequest request, Model model) {
        super(request, model);
    }

    @Override
    public String run() {
        model.addAttribute("title", "index");
        return "home/index";
    }
}
