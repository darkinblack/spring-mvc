package com.bfs.springmvc.dao.impl;

import com.bfs.springmvc.dao.AbstractHibernateDao;
import com.bfs.springmvc.dao.BlogDao;
import com.bfs.springmvc.domain.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("blogDao")
public class BlogDaoImpl extends AbstractHibernateDao<Blog> implements BlogDao {

    public BlogDaoImpl(){
        setClazz(Blog.class);
    }

    @Override
    public int addBlog(Blog blog) {
        persist(blog);
        return 0;
    }

    @Override
    public Blog listBlog(int id) {

        return findById(id);
    }

    @Override
    public int editBlog(Blog blog) {
        merge(blog);
        return 0;
    }

    @Override
    public List<Blog> listAll() {

        return findAll();
    }
}
