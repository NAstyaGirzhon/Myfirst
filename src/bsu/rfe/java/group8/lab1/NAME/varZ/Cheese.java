package bsu.rfe.java.group8.lab1.NAME.varZ;

public class Cheese extends Food {
	public double calories =45.0;

public Cheese()	{
super("���");
}
public void consume() {
System.out.println(this + " ������, ������������: " + this.calculateCalories());
}
public double calculateCalories() {
	return calories;
}

}