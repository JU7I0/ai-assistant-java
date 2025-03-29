package com.juliobarros.aiassistantjava.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Prompt {
    private String content;

    public Prompt() {
    }
    
    @JsonCreator
    public Prompt(@JsonProperty("content") String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
