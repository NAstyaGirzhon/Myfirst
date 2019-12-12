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
		 if (parts[0].equals("���")) {
			 breakfast[itemsSoFar] = new Cheese();
			 }
		 else
	if (parts[0].equals("������"))	{
		breakfast[itemsSoFar] = new Apple(parts[1]);
	}
	 else
			if (parts[0].equals("�����"))	{
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
                     System.out.println("�� ����� ����� ����� " + parts[0] + ".\n����������...\n");
                     itemsSoFar--;
             }
         }
		 itemsSoFar++;
	}
	 System.out.println("����� �������"+ itemsSoFar  );
	 if (FTSort){
         Arrays.sort(breakfast, new FoodComparator());
         }
   
	
	 for (Food item: breakfast)
		 if (item!=null)
	// ���� ������� �� null - ���������� ������� 
		 item.consume();
		 else
	// ���� ����� �� �������� null - ������ �������� ����� 
		// ������ ���������, ���� 20 ��������� � ������� ���� 
		// �������� � �������, � ��� ����� ���� �� // ������������ ��� 
			 break;
	 if(FTCal) {
	 int j = 0;
	 double sum=0.0;
	 Food AppleSmall = new Apple("���������");
	 int productCounter = 0;
	 
	 while (breakfast[j]!=null) {
		sum += breakfast[j].calculateCalories();
	 	if(breakfast[j++].equals(AppleSmall)) productCounter++;
	 }
	 
	 
	 System.out.println("����� �������: "+ sum  );
	 System.out.println("� ����� �������� "+productCounter+" ��������� �����");
	 System.out.println("����� ��������!");
	 }
 }
 
 }
