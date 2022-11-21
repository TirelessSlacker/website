package com.mysite.mysite.constants.templateData;

public enum BlogPostArchives{
    HOME_PAGE("Home Page"
    ,"Welcome to my blog!"
    ,"/fromBeginning"
    ,"See blog posts from the beginning!")
    
    ,CHRONOLOGICAL_ORDERING("Blog posts in chronological order"
    ,"See blog posts from the beginning!"
    ,"/"
    ,"Home Page");

    private String title;
    private String heading;
    private String hyperlink;
    private String hyperlinkText;
    
    

    BlogPostArchives(
        String title
        ,String heading
        ,String hyperlink
        ,String hyperlinkText) {
        this.title = title;
        this.heading = heading;
        this.hyperlink = hyperlink;
        this.hyperlinkText = hyperlinkText;
    }

    public String getTitle(){
        return this.title;
    }

    public String getHeading(){
        return this.heading;
    } 

    public String getHyperlink() {
        return this.hyperlink;
    }

    public String getHyperlinkText() {
        return this.hyperlinkText;
    }
}