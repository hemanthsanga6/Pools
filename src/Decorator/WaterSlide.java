package Decorator;
import Observer.Subject;
public class WaterSlide extends Extras {
	int count;
	public WaterSlide() {
		description = "Water Slides installed in pool";
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
		return 5000;
	}
}