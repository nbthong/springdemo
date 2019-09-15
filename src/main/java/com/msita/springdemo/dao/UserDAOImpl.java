/**
 * 
 */
package com.msita.springdemo.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.msita.springdemo.model.User;

/**
 * @author thongnguyen
 *
 */

public class UserDAOImpl implements UserDAO{
	@Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
    
	public User getUserByUsernameAndPassword(String username, String password) {
		Criteria cr = getCurrentSession().createCriteria(User.class);
        cr.add(Restrictions.eq("username",username));
        cr.add(Restrictions.eq("password",password));
        User user = (User) cr.list().get(0);		
		return user;
	}
}
