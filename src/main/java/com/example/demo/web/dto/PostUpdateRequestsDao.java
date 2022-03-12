package com.example.demo.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
public class PostUpdateRequestsDao {
    private String title;
    private String content;

    @Builder
    public PostUpdateRequestsDao(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
