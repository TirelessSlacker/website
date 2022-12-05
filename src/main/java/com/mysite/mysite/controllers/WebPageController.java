package com.mysite.mysite.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mysite.mysite.constants.templateData.BlogPostArchives;
import com.mysite.mysite.repositories.BlogPostRepository;

@Controller
public class WebPageController {
    
    private BlogPostRepository blogPostRepository;

    public WebPageController(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    @RequestMapping(value = "/") 
    public String home(Model model) {
        model.addAttribute("blogPostArchive",BlogPostArchives.HOME_PAGE);
        model.addAttribute("blogPost",blogPostRepository.findAllByOrderByPostNum());
        return  "blogPostArchive";
    }

    @RequestMapping(value = "/fromBeginning")
    public String fromBeginning(Model model) {
        model.addAttribute("blogPostArchive",BlogPostArchives.CHRONOLOGICAL_ORDERING);
        model.addAttribute("blogPost",blogPostRepository.findAllByOrderByPostNumDesc());
        return "blogPostArchive";
    }
}
