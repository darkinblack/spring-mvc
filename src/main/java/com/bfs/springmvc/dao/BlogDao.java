package com.bfs.springmvc.dao;

import com.bfs.springmvc.domain.Blog;

import java.util.List;

public interface BlogDao {

    int addBlog(Blog blog);
    Blog listBlog(int id);
    int editBlog(Blog blog);
    List<Blog> listAll();

}
