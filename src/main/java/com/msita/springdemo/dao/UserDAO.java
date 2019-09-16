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
	public User getUserByUsername(String username);
}
