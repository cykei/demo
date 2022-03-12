package com.example.demo.controller;

import com.example.demo.web.dto.PostResponseDto;
import com.example.demo.web.dto.PostSaveRequestDto;
import com.example.demo.service.PostService;
import com.example.demo.web.dto.PostUpdateRequestsDao;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostApiController {
    private final PostService postService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostSaveRequestDto requestDto) {
        return postService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostUpdateRequestsDao requestsDao ) {
        return postService.update(id, requestsDao);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostResponseDto findById(@PathVariable Long id) {
        return postService.findById(id);
    }
}
