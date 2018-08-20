package org.jpatest.demo;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

public class IndexController {

    @GetMapping("/index")
    public String getIndex(Model model){

        model.addAttribute("list", new ArrayList<>());
        return "index";
    }
}
