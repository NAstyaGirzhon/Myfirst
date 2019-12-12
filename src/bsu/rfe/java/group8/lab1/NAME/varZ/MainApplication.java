package bsu.rfe.java.group8.lab1.NAME.varZ;

import java.util.Arrays;

public class MainApplication {
 public static void main(String[] args) throws Exception {
	
	 Food[] breakfast = new Food[20];
	 boolean FTSort = false;
     boolean FTCal = false;
	 int itemsSoFar = 0; 
	 for (String arg: args) {
		 String[] parts = arg.split("/"); 
		 if (parts[0].equals("Сыр")) {
			 breakfast[itemsSoFar] = new Cheese();
			 }
		 else
	if (parts[0].equals("Яблоко"))	{
		breakfast[itemsSoFar] = new Apple(parts[1]);
	}
	 else
			if (parts[0].equals("Пирог"))	{
				breakfast[itemsSoFar] = new Pie(parts[1]);
	}
		 else {
             switch (parts[0]) {
                 case "-sort":
                     FTSort = true;
                     break;
                 case "-calories":
                     FTCal = true;
                     break;
                 default:
                     System.out.println("Не может найти класс " + parts[0] + ".\nПродолжить...\n");
                     itemsSoFar--;
             }
         }
		 itemsSoFar++;
	}
	 System.out.println("Длина массива"+ itemsSoFar  );
	 if (FTSort){
         Arrays.sort(breakfast, new FoodComparator());
         }
   
	
	 for (Food item: breakfast)
		 if (item!=null)
	// Если элемент не null - употребить продукт 
		 item.consume();
		 else
	// Если дошли до элемента null - значит достигли конца 
		// списка продуктов, ведь 20 элементов в массиве было 
		// выделено с запасом, и они могут быть не // использованы все 
			 break;
	 if(FTCal) {
	 int j = 0;
	 double sum=0.0;
	 Food AppleSmall = new Apple("Маленькое");
	 int productCounter = 0;
	 
	 while (breakfast[j]!=null) {
		sum += breakfast[j].calculateCalories();
	 	if(breakfast[j++].equals(AppleSmall)) productCounter++;
	 }
	 
	 
	 System.out.println("Сумма калорий: "+ sum  );
	 System.out.println("В вашем завтраке "+productCounter+" маленьких яблок");
	 System.out.println("Всего хорошего!");
	 }
 }
 
 }
