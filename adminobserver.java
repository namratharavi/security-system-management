import java.util.*;
public class adminobserver extends adminnotify{
	Scanner sn = new Scanner(System.in);
	public adminobserver(String s, int priority, String accessto) {
        this.priority = priority; 
        name = s;
        access = accessto;
    }
	@Override
    public void update() {
        System.out.println("the user with name "+name+" and priority "+priority+" wants access to "+access);
        System.out.println("if u want to give him/her access please press Y");
        String ch = sn.next();
        if(ch == "Y")
        {
        	System.out.println("access given");
        }
        else {
        	System.out.println("access denied");
        }
	}

}
