import java.util.*;
public class demo {

	public static void main(String[] args) 
	{
		Scanner sn = new Scanner(System.in);
		int i = 0, cn = 1 ,count = 0;
		user admin;
		adminobserver notify = null ;
		user []users;
		resinterface resource;
		userfactory factory = new userfactory();
		System.out.println("enter admin name");
		String name = sn.next();
		admin = factory.makeadmin(name, 4);
		System.out.println("how many users do u want to add??");
		int n = sn.nextInt();
		users = new user[n];
		while(i < n){
			System.out.println("enter user name");
			String username = sn.next();
			System.out.println("enter priority");
			int pr = sn.nextInt();
			users[i] = factory.makeuser(username, pr);
			i++;
		}
		do{
			System.out.println("1.Admin 2.User");
			System.out.println("enter choice");
			int ch1 = sn.nextInt();
			
			if(ch1 == 1){
				
				if(notify != null)
					notify.update();
			}
			else if(ch1 == 2){
				System.out.println("enter user name");
				String username = sn.next();
				System.out.println("enter priority");
				int pr = sn.nextInt();
				do{
					System.out.println("1.Access resource");
					System.out.println("2.get Access");
					System.out.println("3.logout");
					System.out.println("enter ur choice");
					int ch2 = sn.nextInt();
					if(ch2 == 1){
						System.out.println("1.network 2.database");
						int ch3 = sn.nextInt();
						if(ch3 == 1){
							resource = new networkproxy();
							resource.accessresource(pr);
						}
						else if (ch3 == 2){
							resource = new networkproxy();
							resource.accessresource(pr);
						}
					}
					else if(ch2 == 2){
						System.out.println("what do u want access to?");
						String ch4 = sn.next(); 
						notify = new adminobserver(username,pr, ch4);
					}
					else if (ch2 == 3){
						cn = 0;
					}
				}while(cn == 1);
			}
			System.out.println("enter 1 to continue");
			count = sn.nextInt();
		}while(count == 1);
		sn.close();
	}
}
