package com.bfs.springmvc.controller;


import com.bfs.springmvc.domain.Blog;
import com.bfs.springmvc.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/blog")
@CrossOrigin(origins = "http://localhost:4200")
public class BlogController {

    private BlogService blogService;
    @Autowired
    public void setBlogService(BlogService blogService){
        this.blogService=blogService;
    }

    @GetMapping("/all")
    public List<Blog> getAllBlogs(){
        System.out.println(blogService.getAllBlog());
        return blogService.getAllBlog();
    }

    @GetMapping("/{id}")
    public Blog getBlog(@PathVariable Integer id){
        System.out.println(blogService.getBlog(id));
        return blogService.getBlog(id);
    }

    @PostMapping("/addBlog")
    public int addBlog(@RequestBody Blog blog){
        blog.setDate(new Date());
        blogService.addBlog(blog);
        return 1;
    }

    @PostMapping("/edit")
    public int editBlog(@RequestBody Blog blog){
        System.out.println(blog);
        blogService.updateBlog(blog);
        return 1;
    }

}
