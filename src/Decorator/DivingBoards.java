package Decorator;
import Observer.Subject;
public class DivingBoards extends Extras {
	int count;
	public DivingBoards() {
		description = "Diving boards installed in pool";
	}
	public void setCount(int count)
	{
		this.count = count;
		Subject s= new Subject();
		s.notifyUsers();
	}
	public int getCount()
	{
		return count;
	}
	 
	public double cost() {
		return 3000;
	}
}
