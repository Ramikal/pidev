package esprit.team.pi.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import esprit.team.pi.ejb.domain.User;

/**
 * Session Bean implementation class UserService
 */
@Stateless
public class UserService implements UserServiceRemote {

	
	@PersistenceContext(unitName = "userUnit")
	EntityManager em;
	
    public UserService() {
    }

	@Override
	public void createUser(User user) {
		em.persist(user);		
	}

	@Override
	public User findUserById(int idUser) {
		
		return em.find(User.class, idUser);
	}

	@Override
	public void updateUser(User user) {
		em.merge(user);
		
	}

	@Override
	public void deleteUser(User user) {
		em.remove(em.merge(user));
		
	}

	@Override
	public List<User> getAll() {
		List<User> resultList = em.createQuery("SELECT u FROM User u",User.class).getResultList();
		return resultList;
	}

	@Override
	public User auth(String mail, String pwd) {
		User user=null;
		
		Query q=em.createQuery("SELECT u FROM User u where u.email='"+mail+"' and u.pwd='"+pwd+"'", User.class);
		user = (User) q.getSingleResult();
		
		
		
			
			return user;
	}

	

}
