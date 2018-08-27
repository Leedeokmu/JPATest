package org.jpatest.demo;


import org.jpatest.demo.model.Author;
import org.jpatest.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    AuthorRepository authorRepository;


    @GetMapping("/index")
    public String getIndex(Model model){

        model.addAttribute("list", new ArrayList<>());
        return "index";
    }

    @GetMapping("/author/list")
    public String getAuthorList(Model model){
        List<Author> authorList = authorRepository.findAll();

        model.addAttribute("authorList", authorList);
        return "authorList";
    }
}
