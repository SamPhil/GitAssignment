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
			n--;
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
			n--;
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
			n--;
			return returnElement;
		}
		
	}
	
	public void printLinkedListTail(){
		ListElement printElement = new ListElement();

		for(int j=n;j>1;j--){
			printElement = head;
		for(int i=1;i<n;i++){
			printElement = printElement.next;
			if(i==j-1){
			
			System.out.println("index: " + i + " Data: " + printElement.getData());
			}
		}
		}
		System.out.println("head: index: 1 Data: " + head.getData()); //not printed inside print loops
	}
	
	public void printLinkedListHead(){
		ListElement printElement = new ListElement();
		printElement = head;
		for(int i=1;i<n;i++){
			System.out.println("index: " + i + " Data: " + printElement.getData());
			printElement = printElement.next;
		}
		System.out.println("tail: index: " + n + " Data: " +  printElement.getData()); //prints tail elements which is not printed in the loop
		
	}
	
	
}
