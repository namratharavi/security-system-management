
public class userfactory {
	
	/*public userfactory(String username, int level, String desig){
		this.username = username;
		this.level = level;
		this.desig = desig;
	}*/
	public user makeadmin(String username, int p){
	
		return new admin(username,p);
	}
	public user makeuser(String username,  int p){
		
		return new comuser(username,p);
	}
	
}
