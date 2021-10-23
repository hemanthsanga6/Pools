package Observer;
import Decorator.JetSpray;
public class extrasUsers {
    private String name;
    private int count;
    private Subject subject = new Subject();
    public extrasUsers(String string) {
		// TODO Auto-generated constructor stub
    	this.name=name;
    }
	
    public void update()
    {	
    Inventory.Inventory();
    }
    public void registerUser(Subject S)
    {
        subject = S;
    }
            
}
