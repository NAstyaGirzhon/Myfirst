package bsu.rfe.java.group8.lab1.NAME.varZ;

import java.util.Comparator;

public class FoodComparator  implements Comparator<Food>  {
	 public int compare(Food arg0, Food arg1) {
		 double a= 0.0,b=0.0;
		 if (arg0==null) return 1; 
		 if (arg1==null) return -1; 
		 
		 if (arg0 instanceof Apple) 
			 a = ((Apple) arg0).calculateCalories();
		 else if (arg0 instanceof Pie)
			 a = ((Pie) arg0).calculateCalories();
		 else 
			 a = ((Cheese) arg0).calculateCalories();
		 
		 if (arg1 instanceof Apple) 
			 b = ((Apple) arg1).calculateCalories();
		 else if (arg1 instanceof Pie)
			 b = ((Pie) arg1).calculateCalories();
		 else 
			 b = ((Cheese) arg1).calculateCalories();
	
		
		 return Double.compare(a,b); 
	 }
	
	public FoodComparator() {
		// TODO Auto-generated constructor stub
	}

}
