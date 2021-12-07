package com.bfs.springmvc.dao;

import com.bfs.springmvc.domain.Book;

public interface BookDao {

    int addBook(Book book);

    Book listBook(int id);

    int updateBook(Book book);

    Book getBookByName(String name, int value);

}
