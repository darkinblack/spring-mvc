//package com.bfs.springmvc.dao.impl;
//
//import com.bfs.springmvc.dao.AbstractHibernateDao;
//import com.bfs.springmvc.dao.BookDao;
//import com.bfs.springmvc.domain.Book;
//import org.hibernate.query.Query;
//import org.springframework.stereotype.Repository;
//
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Root;
//import java.util.List;
//
//@Repository("bookDao")
//public class BookDaoImpl extends AbstractHibernateDao<Book> implements BookDao {
//    public BookDaoImpl() {
//        setClazz(Book.class);
//    }
//
//    @Override
//    public int addBook(Book book) {
//        persist(book);
//        return 0;
//    }
//
//    @Override
//    public Book listBook(int id) {
//        Book book  = findById(id);
//        return book;
//    }
//
//    @Override
//    public int updateBook(Book book) {
//        merge(book);
//        return 1;
//    }
//
//    @Override
//    public Book getBookByName(String name, int value) {
//        CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();
//        CriteriaQuery<Book> criteriaQuery= criteriaBuilder.createQuery(Book.class);
//        Root<Book> root = criteriaQuery.from(Book.class);
//        criteriaQuery.select(root);
//        criteriaQuery.where(criteriaBuilder.equal(root.get(name),value));
//
//        Query<Book> query = getCurrentSession().createQuery(criteriaQuery);
//        List<Book> books = query.getResultList();
//        if (books.size()!=0){
//            return books.get(0);
//        }else return null;
//
//    }
//
//
//
//
//}
