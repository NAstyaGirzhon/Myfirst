package bsu.rfe.java.group8.lab1.NAME.varZ;

public class Apple extends Food {
	private String size;
	private double small = 52.2, medium = 90.3, big =123.4;
	public Apple(String size) {
		super("Яблоко");   
		this.size = size;
		// TODO Auto-generated constructor stub
	}
	 // Селектор для доступа к полю данных РАЗМЕР 
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void consume() {
		System.out.println(this + " съедено, калорийность: " + this.calculateCalories());		
	}

	@Override
	public String toString() {
		return super.toString() + " размера '" + size.toUpperCase() + "'";
	}
	public boolean equals(Object arg0) {   
		if (super.equals(arg0)) {   
			if (!(arg0 instanceof Apple)) return false;  
			return size.equals(((Apple)arg0).size);   
			} 
		else   
				return false;  } 

	public double calculateCalories() {
		if (size.equals("Маленькое")) {
			return small;
		} 
		else
			if (size.equals("Среднее")) {
			return medium;
		} 
			else
		if (size.equals("Большое")) {
			return big;
		} 
		else return 0.0;	
	}
	
	
}
