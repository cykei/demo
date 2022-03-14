package com.example.demo.domain.post;


import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostRepositoryTest {
    @Autowired
    PostRepository postRepository;

    @After
    public void cleanUp() {
        postRepository.deleteAll();
    }

    @Test
    public void savePostTest() {
        String title = "테스트 타이틀";
        String content = "테스트 본문";

        postRepository.save(Post.builder()
                .title(title)
                .content(content)
                .author("cykei")
                .build());

        List<Post> postsList = postRepository.findAll();

        Post posts =postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }

    @Test
    public void BaseTimeEntityTest(){
        LocalDateTime now = LocalDateTime.now();
        postRepository.save(Post.builder()
                .title("title")
                .content("content")
                .author("author")
                .build());

        List<Post> posts = postRepository.findAll();

        Post post = posts.get(0);

        System.out.println("createdDate : "+ post.getCreatedDate() + ", modifiedDate : "+ post.getModifiedDate());
    }
}
