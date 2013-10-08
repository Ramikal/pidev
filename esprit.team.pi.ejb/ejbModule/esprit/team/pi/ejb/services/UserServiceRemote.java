package esprit.team.pi.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import esprit.team.pi.ejb.domain.User;


@Remote
public interface UserServiceRemote {
	
		public void createUser(User user);
		public User findUserById(int idUser);
		public User auth(String mail,String pwd);
		public void updateUser(User user);
		public void deleteUser(User user);
		public List<User> getAll(); 

}
