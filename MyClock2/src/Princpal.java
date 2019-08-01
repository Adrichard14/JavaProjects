
public class Princpal {
	public static void main(String[] args) {
		ClockDisplay c1 = new ClockDisplay(3, 57);
		c1.timeTick();
		c1.timeTick();
		c1.timeTick();
		c1.timeTick();
		c1.timeTick();
		System.out.println(c1.getTime());
	}
}
