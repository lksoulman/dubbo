package com.lksoulman.dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import com.lksoulman.dubbo.api.UserService;
import com.lksoulman.dubbo.api.domain.User;

public class UserServiceImpl implements UserService {

	private static final int BOUND_AGE = 100;
	private static final int BOUND_SEX = 2;
	private static Random rand = new Random();
	private static int incId = 0;

	@Override
	public User getUser(int id) {
		User user = doRandUser(id);
		return user;
	}

	@Override
	public User getUser(String username) {
		User user = doRandUser(username);
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();

		for (int i = 0; i < 10; i++) {
			users.add(doRandUser());
		}

		return users;
	}

	@Override
	public List<User> getTopUser(int count) {
		List<User> users = new ArrayList<User>();

		for (int i = 0; i < count; i++) {
			users.add(doRandUser());
		}

		return users;
	}

	private static synchronized User doRandUser(int id) {
		User user = new User();
		user.setId(id);
		user.setAge(rand.nextInt(BOUND_AGE));
		user.setSex(BOUND_SEX);
		user.setName("User" + id);

		return user;
	}

	private static synchronized User doRandUser(String name) {
		User user = new User();
		user.setId(doGetId());
		user.setAge(rand.nextInt(BOUND_AGE));
		user.setSex(BOUND_SEX);
		user.setName(name);

		return user;
	}

	private static synchronized User doRandUser() {
		User user = new User();
		user.setId(doGetId());
		user.setAge(rand.nextInt(BOUND_AGE));
		user.setSex(BOUND_SEX);
		user.setName("User" + user.getId());

		return user;
	}

	private static int doGetId() {
		return ++incId;
	}

}
