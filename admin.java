
public class admin implements user {
	
	private String name;
	private int priority;
	public admin(String n, int p ){
		name = n;
		priority = p;
	}
	@Override
	public void displaydetails() {
		
		System.out.println("employee priority is"+priority);	
	}

}
