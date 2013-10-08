package esprit.team.pi.client.interfaces;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class Locator {

	private static Context context;

	public final static String MODULE_NAME="esprit.team.pi.ejb";

	public static Object lookup(String ejbName,Class viewInterface){

	Object o=null;
	String viewClassName=viewInterface.getCanonicalName();

	try {
	context=new InitialContext();

	o=context.lookup("/"+MODULE_NAME+"/"+ejbName+"!"+viewClassName);



	} catch (NamingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	return o;





	}
	
	
}
