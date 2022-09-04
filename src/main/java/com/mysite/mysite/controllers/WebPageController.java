package com.mysite.mysite.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mysite.mysite.constants.templateData.BlogPostArchives;
import com.mysite.mysite.data.BlogPosts;

@Controller
public class WebPageController {

    @GetMapping(value = "/") 
    public String home(Model model) {
        model.addAttribute("blogPostArchive",BlogPostArchives.HOME_PAGE);
        model.addAttribute("blogPosts",BlogPosts.getReverseChronological());
        return  "blogPostArchive";
    }

    @GetMapping(value = "/fromBeginning")
    public String fromBeginning(Model model) {
        model.addAttribute("blogPostArchive",BlogPostArchives.CHRONOLOGICAL_ORDERING);
        model.addAttribute("blogPosts",BlogPosts.getChronological());
        return "blogPostArchive";
    }
}
