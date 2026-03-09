package de.gfn.basic.patterns.adapter;

import java.util.Arrays;

public class Posting {

    private String author;
    private String group;
    private String title;
    private String body;
    private String[] tags;

    public Posting(String author, String group, String title, String body, String... tags) {
        this.author = author;
        this.group = group;
        this.title = title;
        this.body = body;
        this.tags = tags;
    }

    public String getAuthor() {
        return author;
    }

    public String getGroup() {
        return group;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String[] getTags() {
        return tags;
    }

    public void post() {
        System.out.println("-------------- POST --------------");
        System.out.println("-- START");
        System.out.println("-- AUTHOR: \t" + author);
        System.out.println("-- GROUP: \t" + group);
        System.out.println("-- TITLE: \t" + title);
        System.out.println("-- BODY: \t" + body);
        System.out.println("-- TAGS: \t" + Arrays.toString(tags));
        System.out.println("-- END \n");
    }
}
