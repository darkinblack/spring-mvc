//package com.bfs.springmvc.controller;
//
//import com.bfs.springmvc.domain.Book;
//import com.bfs.springmvc.service.BookService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/book")
//public class BookController {
//    private BookService bookService;
//
//    @Autowired(required = true)
//    @Qualifier(value = "bookService")
//    public void setBookService(BookService bookService) {
//        this.bookService = bookService;
//    }
//
//
//    @GetMapping("/get/{bid}")
//    @ResponseBody
//    public String listBook( @PathVariable Integer bid, Model model){
//        Book book =  bookService.getBookById(bid);
//        return book.toString();
//    }
//
//    @RequestMapping(value = "/add_book",method = RequestMethod.GET)
//    public String addBookPage(){
//        return "book";
//    }
//
//    @RequestMapping(value = "/add_book",method = RequestMethod.POST)
//    @ResponseBody
//    public String addBook(@ModelAttribute("book") Book book){
//
//        if (bookService.isbnCheck(book.getIsbn())){
//            return "isbn exist";
//        }else {
//            this.bookService.addBook(book);
//            return "add succeed";
//        }
//
//    }
//
//    @RequestMapping(value = "/update_book",method = RequestMethod.GET)
//    public String updateBookPage(){
//        return "updatebook";
//    }
//
//    @RequestMapping(value = "/update_book",method = RequestMethod.POST)
//    @ResponseBody
//    public String updateBook(@ModelAttribute("book") Book book){
//        Book oldBook = bookService.getBookById(book.getId());
//        if(oldBook!=null){
//            bookService.updateBook(book);
//            return "succeed";
//        }else {
//            return "no such book";
//        }
//
//
//    }
//
//
//
//
//
//
//
//
//
//}
