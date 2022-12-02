package com.mysite.mysite.service;

import java.util.List;
import java.util.stream.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysite.mysite.entities.BlogPost;
import com.mysite.mysite.repositories.BlogPostRepository;

@Service
public class BlogPostService {    

    private BlogPostRepository blogPostRepository;

    @Autowired
    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public List<BlogPost> getChronological() {
        return blogPostRepository.findAllOrderByIdAsc();
    }

    public List<BlogPost> getReverseChronological() {
        return blogPostRepository.findAllOrderByIdDesc();
    }

   
} 