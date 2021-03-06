package com.example.demo.domain.post;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {
    // <entity 클래스, pk타입> 을 상속시 기본 crud 메소드가 자동생성됨.
    // entity 클래스와 기본 entity repository 는 함께 위치해야한다.

    @Query("SELECT p FROM Post p ORDER BY p.id DESC")
    List<Post> findAllDesc();
}
