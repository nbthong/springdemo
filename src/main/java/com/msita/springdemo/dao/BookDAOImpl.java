package com.msita.springdemo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.msita.springdemo.model.Book;

@Repository
@Transactional
public class BookDAOImpl implements BookDAO{
	
	@Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
	 
	public List<Book> getBooks(){
        Criteria cr = getCurrentSession().createCriteria(Book.class);
        return cr.list();
    }
	   
}
