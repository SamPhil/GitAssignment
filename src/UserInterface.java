import java.util.Scanner;

import Phase1.*;

public class UserInterface {

	
	public static void main(String[] args){
	List SingleLL = new List(); //used by all following operations	

		
	Scanner in = new Scanner(System.in);
	System.out.println("Welcome to the SLL database. Five methods of operation are available: 'Add', 'Del', 'ListHead'");	
	System.out.println("'ListTail' and 'Get'.");	
	System.out.println("They are used to enter an element, delete an element, list the element starting with the head");
	System.out.println("list the element starting with the tail or get an individual element");
	System.out.println("Please enter one of the key words listed above to enter that mode or enter 'END' to terminate the program");

		
	String operation;
	
	do {
		operation = in.nextLine();
		
		if(operation.equals("Add")){

			//Determine input value
			System.out.println("Please enter value to be added: ");	
			int input = in.nextInt();
			ListElement addElm = new ListElement(input);
			//addElm.setData(input);
			SingleLL.addElement(addElm);
			if(input==addElm.getData()){
				System.out.println("Value added successfully.");	
			}
		}
		
		else if(operation.equals("Del")){
						
			//Determine index value
			System.out.println("Please enter index value: ");	
			int index = in.nextInt();
			System.out.println("The list element data deleted at this index was:");	
			System.out.println(SingleLL.deleteElement(index).getData());				
			
		}
		else if(operation.equals("Get")){
			
			//Determine index value
			System.out.println("Please enter index value: ");	
			int index = in.nextInt();
			System.out.println("The list element data at this index is:");	
			System.out.println(SingleLL.getElement(index).getData());		
						
		}
		else if(operation.equals("ListHead")){
			System.out.println("The current List begining with the head is: ");
			SingleLL.printLinkedListHead();
			System.out.println("Please enter either 'Add', 'Del','ListHead' or 'ListTail' or 'Get' to enter into the respective mode.");
			System.out.println("Altenatively you may enter 'END' if you wish to terminate the progam.");	
		}
		else if(operation.equals("ListTail")){
			System.out.println("The current List begining with the tail is: ");
			SingleLL.printLinkedListTail();
			System.out.println("Please enter either 'Add', 'Del','ListHead' or 'ListTail' or 'Get' to enter into the respective mode.");
			System.out.println("Altenatively you may enter 'END' if you wish to terminate the progam.");	
		}
		else if(operation.equals("END")){
			System.out.println("System will now terminate. Thank you for using SingleLinkedList database.");
		}
		else {
			System.out.println("Please enter either 'Add', 'Del','ListHead' or 'ListTail' or 'Get' to enter into the respective mode.");
			System.out.println("Altenatively you may enter 'END' if you wish to terminate the progam.");			
		}
	}while(operation!="END");
	
	System.out.println("System terminated.");

	}
}
