package org.pjaygroup.restfulapp1.service;

import java.util.List;

import org.pjaygroup.restfulapp1.model.User;

/**
 * @author Vijay Konduru
 *
 */
public interface UserService {

	List<User> listUsers();

	User getUser(String user_id);

	boolean addUser(User user);

	boolean updateUser(User user);

	boolean destroyUser(String user_id);

}
