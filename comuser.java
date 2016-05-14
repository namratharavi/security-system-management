
public class comuser implements user {
	
	private String name;
	private int priority;
	public comuser(String n, int p ){
		name = n;
		priority = p;
	}
	@Override
	public void displaydetails() {
		
		System.out.println("employee priority is"+priority);

	}
	public String getname(){
		return name;
	}
	
}
