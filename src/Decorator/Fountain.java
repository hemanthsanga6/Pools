package Decorator;
import Observer.Subject;
public class Fountain extends Extras {
	int count;
	public Fountain() {
		description = "Fountain installed in pool for aesthetics";
	}
	public void setCount(int count)
	{
		this.count = count;
	Subject s = new Subject();
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