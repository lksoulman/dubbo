package com.lksoulman.dubbo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.lksoulman.dubbo.api.UserService;
import com.lksoulman.dubbo.api.domain.User;
import com.lksoulman.dubbo.util.JsonUtil;

@Controller
@RequestMapping(value = "/user")
public class BaseController {

	@Reference
	private UserService userService;

	@RequestMapping(value = "/name", method = RequestMethod.GET)
	@ResponseBody
	public String getUserByName(@RequestParam("username") String username) throws JsonProcessingException {

		User user = userService.getUser(username);
		String result = JsonUtil.ToJsonString(user);

		return result;
	}

	@RequestMapping(value = "/id", method = RequestMethod.GET)
	@ResponseBody
	public String getUserById(@RequestParam("id") int id) throws JsonProcessingException {

		User user = userService.getUser(id);
		String result = JsonUtil.ToJsonString(user);

		return result;
	}

	@RequestMapping(value = "/top", method = RequestMethod.GET)
	@ResponseBody
	public String getTopUsers(@RequestParam("count") int count) throws JsonProcessingException {

		List<User> users = userService.getTopUser(count);
		String result = JsonUtil.ToJsonString(users);

		return result;
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public String getAllUsers() throws JsonProcessingException {

		List<User> users = userService.getAllUsers();
		String result = JsonUtil.ToJsonString(users);

		return result;
	}

	@RequestMapping
	@ResponseBody
	public String defaultReturn() {
		return "default";
	}
}
