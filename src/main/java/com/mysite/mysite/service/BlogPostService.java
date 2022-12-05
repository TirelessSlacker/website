package com.mysite.mysite.service;

import java.util.List;

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
        return blogPostRepository.findAllByOrderByPostNum();
    }

    public List<BlogPost> getReverseChronological() {
        return blogPostRepository.findAllByOrderByPostNumDesc();
    }

   
} 