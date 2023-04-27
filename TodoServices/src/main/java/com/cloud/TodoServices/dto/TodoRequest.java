package com.cloud.TodoServices.dto;

import jakarta.persistence.*;

public class TodoRequest {
    private String userid;
    private String title;
    private String description;

    public String getUserid() {
        return userid;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
