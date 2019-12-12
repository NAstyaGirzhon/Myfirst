package bsu.rfe.java.group8.lab1.NAME.varZ;

public class Pie extends Food {

	private String filling; 
	private double cherryCal = 502.2, strawberry= 490.3, apple =323.4;

	public Pie(String filling) {
		super("Пирог");   
		this.filling = filling;
		// TODO Auto-generated constructor stub
	}

	public String getSize() {
		return filling;
	}

	public void setSize(String filling) {
		this.filling = filling;
	}

	@Override
	public void consume() {
		System.out.println(this + " съеден, калорийность: " + this.calculateCalories());		
	}

	@Override
	public String toString() {
		return super.toString() + " начинка '" + filling.toUpperCase() + "'";
	}
	public boolean equals(Object arg0) {   
		if (super.equals(arg0)) {   
			if (!(arg0 instanceof Pie)) return false;  
			return filling.equals(((Pie)arg0).filling);   
			} 
		else   
				return false;  } 

	public double calculateCalories() {
		if (filling.equals("Вишневый")) {
			return cherryCal;
		} 
		else
			if (filling.equals("Клубничный")) {
			return strawberry;
		} 
			else
		if (filling.equals("Яблочный")) {
			return 	apple;
		} 
	else return 0.0;
	}

	public String getfilling() {
		
		return filling;
	}

}