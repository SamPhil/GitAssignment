package Phase1;

public class ListElement {

	ListElement next;
	ListElement previous;
	private int data ;
	public ListElement()
	{
	this.data = 0;
	this.next = null;
	this.previous = null;
	}
	
	/**
	* @param data
	* an i n t e g e r to be s t o r ed in the node
	* @return
	* None
	* 
	**/
	public void setData (int data){ 
	this.data = data ;
	}
	
	public int getData () {
	return this.data;
	}
	
}
