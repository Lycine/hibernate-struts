package service.impl;

import org.junit.Test;

import entity.Users;
import junit.framework.Assert;
import service.UsersDAO;
import serviceimple.UserDAOImpl;

public class TestUsersDAOImpl {

	@Test
	public void testUsersLogin() {
		Users u = new Users(1,"zhangsan","123456");
		UsersDAO udao = new UserDAOImpl();
		Assert.assertEquals(true, udao.usersLogin(u));
	}

}
