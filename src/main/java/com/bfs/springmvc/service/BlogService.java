package com.bfs.springmvc.service;

import com.bfs.springmvc.dao.BlogDao;
import com.bfs.springmvc.domain.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BlogService {
    private BlogDao blogDao;

    @Autowired
    public void setBlogDao(BlogDao blogDao){
        this.blogDao = blogDao;
    }


    @Transactional
    public int addBlog(Blog blog){
        blogDao.addBlog(blog);
        return 1;
    }


    @Transactional
    public int updateBlog(Blog blog){
        blogDao.editBlog(blog);
        return 1;
    }

    @Transactional
    public Blog getBlog(int id){
        return blogDao.listBlog(id);
    }

    @Transactional
    public List<Blog> getAllBlog(){
        return blogDao.listAll();
    }
}
