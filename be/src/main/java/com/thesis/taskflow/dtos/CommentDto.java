package com.thesis.taskflow.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentDto {
    private int id;
    private String content;
    private UserDto author;
    private LocalDateTime date;

    public void setupUser(int id, String name, String email) {
        this.author = new UserDto();
        this.author.setId(id);
        this.author.setEmail(email);
        this.author.setName(name);
    }
}
