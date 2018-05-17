package com.lksoulman.dubbo.api;

import java.util.List;

import com.lksoulman.dubbo.api.domain.User;

/**
 * 
 * @author chengyz
 *
 */

public interface UserService {

	/**
	 * 
	 * @param id
	 * @return
	 */
	User getUser(int id);

	/**
	 * 
	 * @param username
	 * @return
	 */
	User getUser(String username);

	/**
	 * 
	 * @return
	 */
	List<User> getAllUsers();

	/**
	 * 
	 * @param count
	 * @return
	 */
	List<User> getTopUser(int count);
}
