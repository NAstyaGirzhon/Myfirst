package bsu.rfe.java.group8.lab1.NAME.varZ;

public  class Food implements Consumable,Nuritious {
	 public  void consume() {
	}
	String name=null;
	Double calories = null;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    public Food(String name){
	 this.name =name;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		if(!(arg0 instanceof Food))return false;
		if(name==null|| ((Food)arg0).name==null) return false;
		return name.equals(((Food)arg0).name);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double calculateCalories() {
		// TODO Auto-generated method stub
		return 0;
	}

}
