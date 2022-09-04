package com.mysite.mysite.data;

import java.util.List;
import java.util.stream.*;

public enum BlogPosts{
    
    POST_ONE (1,"this is the first post"),
    POST_TWO (2,"this is the second post");

    private final int postNum;
    private final String text;

    BlogPosts(int postNum,String text) {
        this.postNum = postNum;
        this.text = text;
    }

    public static List<BlogPosts> getChronological() {
        return Stream.of(POST_ONE,POST_TWO).collect(Collectors.toList());
    }

    public static List<BlogPosts> getReverseChronological() {
        return Stream.of(POST_TWO,POST_ONE).collect(Collectors.toList());
    }

    public String getText() {
        return this.text;
    }

    public int getPostNum() {
        return this.postNum;
    }
} 