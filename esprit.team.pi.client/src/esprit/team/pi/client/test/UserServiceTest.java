package esprit.team.pi.client.test;


import java.util.Calendar;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import esprit.team.pi.ejb.domain.User;
import esprit.team.pi.ejb.services.UserServiceRemote;



public class UserServiceTest {
	
	UserServiceRemote userService;

	@Before
	public void setUp() throws Exception {
		
		Context ctx1 = new InitialContext();
		userService = (UserServiceRemote) ctx1.
				lookup("/esprit.team.pi.ejb//UserService!esprit.team.pi.ejb.services.UserServiceRemote");
}
	
	@Test
	public void itShouldCreate() {
		
		User user = new User();
		
		
		Calendar cal=Calendar.getInstance();
		cal.set(2009,4,10);
		Date date = cal.getTime();
		
		
		user.setBirthDate(date);
		user.setEmail("user@user");
		user.setFirstName("rami");
		
		user.setLastName("aaaaaa");
		user.setPwd("user");
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		userService.createUser(user);
	}

	@Test
	@Ignore
	public void itShouldFindById() {
		
		User user = userService.findUserById(2);
		System.out.println(user.getIdUser());
		Assert.assertEquals("rami",user.getFirstName()); 
	
	}
	
	@Test
	@Ignore
	public void itShouldUpdate() {
		
		User user = new User();
		user.setIdUser(6);
		user.setFirstName("rami");
		user.setLastName("rami");
		
		Calendar cal=Calendar.getInstance();
		cal.set(2009,4,10);
		Date date = cal.getTime();
		
		user.setBirthDate(date);
		user.setEmail("user@user");
		user.setPwd("user1");
		
		userService.updateUser(user);
		
		Assert.assertEquals("user1", userService.findUserById(6).getPwd());
	}
	
	@Test
	@Ignore
	public void itShouldDelete() {
		
		int size = userService.getAll().size();
		User user = new User();
		
		user.setIdUser(1);
		userService.deleteUser(user);
		
		Assert.assertEquals(size-1,userService.getAll().size());
	}

	
	
}
