package Phase1;

public class List {

	ListElement head;
	ListElement tail;
	int n;
	
	public void addElement(ListElement le){
		if (n==0){
			head = le;
		}
		else {
			tail.next=le;
		}
		tail=le;
		tail.next=null; //nothing is next of tail 
		n++;
	}
	
	
	public ListElement getElement (int index){
		if (index==0){
			return new ListElement(); //essentially null value
		}
		else if (index==1){
			return head;
		}
		else if (index==n){
			return tail;
		}
		else if (index>n){
			return new ListElement(); //essentially null value
		}
		else{
			ListElement returnElement = new ListElement();
			returnElement = head;
			for(int i=1;i<index;i++){
				returnElement = returnElement.next;
			}
			return returnElement;
		}
	}
	
	public ListElement deleteElement(int index){
		
		if (index==0){
			return new ListElement(); //essentially null value
		}
		else if (index==1){
			head.next = head;	//head is no longer in list
			return head;
		}
		else if (index==n){
			ListElement returnElement = new ListElement();
			returnElement = head;
			for(int i=1;i<index-1;i++){
				returnElement = returnElement.next;
			}
			returnElement = tail; 		//tail is no longer in list
			returnElement.next = null;
			return returnElement;
		}
		else if (index>n){
			return new ListElement(); //essentially null value
		}
		else{
			ListElement returnElement = new ListElement();
			returnElement = head;
			for(int i=1;i<index-1;i++){
				returnElement = returnElement.next;
			}
			returnElement.next = returnElement.next.next;		//listelement is now 'jumped' over in list, it no longer exists
			return returnElement;
		}
		
	}
	
	public void printLinkedListTail(){
		
		
	}
	
	public void printLinkedListHead(){
		ListElement printElement = new ListElement();
		printElement = head;
		for(int i=1;i<n;i++){
			System.out.println(printElement);
			printElement = printElement.next;
		}
		System.out.println(printElement); //prints elements which is not printed in the list
		
	}
	
	
}
