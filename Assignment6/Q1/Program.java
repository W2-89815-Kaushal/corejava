package demo02;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int basketsize=sc.nextInt();
		Fruit[] basket =new Fruit[basketsize];
		int counter=0;
		boolean exit=false;
		while(!exit) {
			System.out.println("\n1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits in the basket");
            System.out.println("5. Display name, color, weight, and taste of all fresh fruits");
            System.out.println("6. Display tastes of all stale fruits");
            System.out.println("7. Mark a fruit as stale");
            System.out.println("8. Mark all sour fruits stale");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            
            switch(choice) {
            	case 1:
            		if(counter<basketsize) {
            			Mango mango=new Mango();
            			mango.acceptData(sc);
                        basket[counter++] = mango;
            		}else {
                        System.out.println("Basket is full!");
            		}
            		break;
            		
            	case 2:
            		if(counter<basketsize) {
            		Orange orange=new Orange();
            		orange.acceptData(sc);
                    basket[counter++] = orange;
            		}
            		else {
                    System.out.println("Basket is full!");
        		}
        		break;
            	case 3:
            		if(counter<basketsize) {
            		Apple apple=new Apple();
            		apple.acceptData(sc);
                    basket[counter++] = apple;
            		}
            		else {
                    System.out.println("Basket is full!");
        		}
        		break;
            	case 4:
                    System.out.println("Fruit names in basket:");
            		for (Fruit fruit:basket) {
            			if(fruit!=null) {
            				System.out.println(fruit.name);
            			}
            			
            		}
            		break;
            	case 5:
            		 System.out.println("Fresh fruits in basket:");
                     for (Fruit fruit : basket) {
                         if (fruit != null && fruit.isFresh) {
                             fruit.displayData();
                             System.out.println("Taste: " + fruit.taste());
                         }
                     }
                     break;
            	case 6:
            		 System.out.println("Stale fruits in basket:");
                     for (Fruit fruit : basket) {
                         if (fruit != null && !fruit.isFresh) {
                             fruit.displayData();
                             System.out.println("Taste: " + fruit.taste());
                         }
                     }
                     break;
                  
            	case 7:
            		System.out.print("Enter index of fruit to mark as stale: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < basket.length && basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println("Fruit marked as stale.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
            	case 8:
            		System.out.println("Marking all sour fruits as stale.");
                    for (Fruit fruit : basket) {
                        if (fruit != null && fruit.taste().equals("sour")) {
                            fruit.setFresh(false);
                        }
                    }
                    break;
            	case 9:
            		 exit = true;
                     break;
                 default:
                     System.out.println("Invalid option.");

 
                     
            		
            }

		}
		
		
		
		
		

	}

}
