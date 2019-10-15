package com.pnc.project.stackoverflow.Entity;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Answer {


    @Id
    private Long id;
    private String body;
    private List<Comment> comments;
    private User user;

    public Answer(){

    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "body='" + body + '\'' +
                ", comments=" + comments +
                '}';
    }
}
