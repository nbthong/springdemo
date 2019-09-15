/**
 * 
 */
package com.msita.springdemo.dao;

import com.msita.springdemo.model.User;

/**
 * @author thongnguyen
 *
 */
public interface UserDAO {
	public User getUserByUsernameAndPassword(String username, String password);
}
