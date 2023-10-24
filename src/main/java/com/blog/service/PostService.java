package com.blog.service;

import com.blog.dto.PostDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostService {
    List<PostDto> findAllPosts();

    void createPost(PostDto postDto);

    PostDto findPostById(Long postId);

    void updatePost(PostDto postDto);

    PostDto findPostByUrl(String postUrl);

    void deletePost(Long postId);

    List<PostDto> searchPosts(String query);


}