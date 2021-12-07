//package com.bfs.springmvc;
//
//import com.bfs.springmvc.config.JdbcConfig;
//import com.bfs.springmvc.domain.Book;
//import com.bfs.springmvc.service.BookService;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import java.util.Date;
//
//public class Demo {
//    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
//        BookService bookService =  context.getBean("bookService",BookService.class);
//
//        Book book = new Book();
//        book.setBook_name("book2");
//        book.setAuthor("author2");
//        book.setIsbn(2);
//        book.setPublish_Date(new Date());
//
////        bookService.addBook(book);
//
//
//    }
//}
