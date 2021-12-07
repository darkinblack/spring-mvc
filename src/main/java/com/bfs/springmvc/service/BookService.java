//package com.bfs.springmvc.service;
//
//import com.bfs.springmvc.dao.BookDao;
//import com.bfs.springmvc.domain.Book;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.transaction.Transactional;
//
//@Component
//public class BookService {
//
//    private BookDao bookDao;
//
//    @Autowired
//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
//
//    @Transactional
//    public int addBook(Book book){
//        bookDao.addBook(book);
//        return 1;
//    }
//
//    @Transactional
//    public int updateBook(Book book){
//        bookDao.updateBook(book);
//        return 1;
//    }
//
//    @Transactional
//    public Book getBookById(int id){
//
//        return bookDao.listBook(id);
//    }
//
//
//    @Transactional
//    public Boolean isbnCheck(int isbn){
//        if(bookDao.getBookByName("isbn",isbn)!=null){
//            return true;
//        }
//        return false;
//    }
//}
