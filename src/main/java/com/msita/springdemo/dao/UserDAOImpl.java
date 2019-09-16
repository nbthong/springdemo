/**
 * 
 */
package com.msita.springdemo.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.msita.springdemo.model.User;

/**
 * @author thongnguyen
 *
 */

@Repository
@Transactional
public class UserDAOImpl implements UserDAO{
	@Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
    
	public User getUserByUsername(String username) {
		Criteria cr = getCurrentSession().createCriteria(User.class);
        cr.add(Restrictions.eq("username",username));
        User user = (User) cr.list().get(0);		
		return user;
		
	}
}
