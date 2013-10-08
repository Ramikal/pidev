package esprit.team.pi.client.test;

import java.util.Calendar;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import esprit.team.pi.ejb.domain.User;
import esprit.team.pi.ejb.services.UserServiceRemote;



public class user {

	public static void main(String[] args) {
		UserServiceRemote userService = null;
		Context ctx;
		try {
			ctx = new InitialContext();
			userService = (UserServiceRemote) ctx.
					lookup("/esprit.team.pi.ejb//UserService!esprit.team.pi.ejb.services.UserServiceRemote");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
User user = new User();
		
		
		Calendar cal=Calendar.getInstance();
		cal.set(2009,4,10);
		Date date = cal.getTime();
		
		
		user.setBirthDate(date);
		user.setEmail("user@user");
		user.setFirstName("rami");
		user.setArt(true);
		user.setLastName("aaaaaa");
		user.setPwd("user");
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		userService.createUser(user);
	}

}
