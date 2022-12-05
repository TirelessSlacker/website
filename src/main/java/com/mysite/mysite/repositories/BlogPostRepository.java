package com.mysite.mysite.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mysite.mysite.entities.BlogPost;

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost,Integer> {
                        
    @Query
    List<BlogPost> findAllByOrderByPostNum();

    @Query
    List<BlogPost> findAllByOrderByPostNumDesc();
}