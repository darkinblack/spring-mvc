package com.bfs.springmvc.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.util.List;

public abstract class AbstractHibernateDao<T extends Serializable> {

    @Autowired
    protected SessionFactory sessionFactory;

    protected Class<T> clazz;

    protected final void setClazz(final Class<T> clazzToSet) {
        clazz = clazzToSet;
    }

    public T findById(final Integer id) {
        return getCurrentSession().get(clazz, id);
    }

    public List<T> findAll(){return getCurrentSession().createQuery("From Blog ").list();}

    public void persist(T t) {
        getCurrentSession().persist(t);
    }

    public void merge(T t){
        getCurrentSession().merge(t);
    }

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void flush(){
        getCurrentSession().flush();
    }

//    public T findByName(final String name, final String target){
//        CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();
//        CriteriaQuery<T> = criteriaBuilder.createQuery(T.class);
//
//
//    }
}