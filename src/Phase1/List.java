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
			for(int i=0;i<index;i++){
				returnElement = returnElement.next;
			}
			return returnElement;
		}
	}
	
	public ListElement deleteElement(int index){
		
		
	}
	
	public void printLinkedListTail(){
		
		
	}
	
	public void printLinkedListHead(){
		
	}
	
	
}
