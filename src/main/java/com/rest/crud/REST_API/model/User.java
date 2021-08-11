package com.rest.crud.REST_API.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private String description;
    private boolean published;

    public User() {

    }

    public User(String name, String description, boolean published) {
        this.name = name;
        this.description = description;
        this.published = published;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean isPublished) {
        this.published = isPublished;
    }

    @Override
    public String toString() {
        return "User [id= " + id + ", name=" + name + ", desc=" + description + ", published=" + published + "]";
    }
}