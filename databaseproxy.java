
public class databaseproxy implements resinterface {
	private static int priority = 2;
	private resinterface resource;
	@Override
	public void accessresource(int pr) {
		if(resource == null)
		{
			resource = new network();
		}
		if(pr >= priority)
			resource.accessresource(pr);
		else {
			System.out.println("not possible to access becoz your priority doesnt allow");
		}
	}
}
