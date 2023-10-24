package com.blog.service;

import com.blog.dto.CommentDto;

import java.util.List;

public interface CommentService {
    void createComment(String postUrl, CommentDto commentDto);

    List<CommentDto> getComments();

    void deleteComment(Long commentId);
}

