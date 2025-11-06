package linkedList;

public class LinkedList <T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	//constructor
	public LinkedList() {head = null; tail=null; size=0;}
	
	public void clear() {head = null; tail=null; size=0;}//end clear
	
	public int size() {return size;} //end size
	
	public boolean isEmpty() {return size == 0;}//end isEmpty
	
	public T First () {
		if (size ==0)
			return null;
		return head.Data; }//end first
	
	public T Last() {
		if (size ==0)
			return null;
		return tail.Data; }//end last
	
	public void addFirst (T Da) {
		Node<T> newnode = new Node<T>(Da);
		newnode.next = head;
		head = newnode;
		if (size ==0)
			tail = head;
		size ++; }//end addFirst
	
	public void addLast (T Da) {
		Node<T> newnode = new Node<T>(Da);
		if (size ==0)
		{ 	head = newnode;
			tail=head;}//end if 
		else
		{ 	tail.next = newnode;
			tail=newnode;}//end else
		size++;
	}//end addLast
	
	public void add_sp (T Da , int pos) {
		if (pos ==1 )
			addFirst (Da);
		else 
		{
			Node<T> newnode = new Node<T>(Da);
			Node<T> Temp = head;
			for ( int i =0; i<pos-2;i++)
			{Temp=Temp.next;} //end for loop
			newnode.next=Temp.next;
			Temp.next=newnode;
			size ++;}//end else
	}//end add_sp
	
	public void removeFirst() {
		if ( head == null)
			System.out.println("the list is empty");
		else
			head = head.next; size--; 
	}//end removeFirst
	
	public void removeLast() {
		if (size ==0)
			System.out.println("the list is empty");
		else
		{
			Node<T> Temp = head;
			for ( int i =0; i<size-2;i++)
				{Temp=Temp.next;} //end for loop
		
			Temp.next=null;
			tail=Temp;
			size--;}//end else
	}// end removeLast
	
	public void printList() {
		Node<T> Temp = head;
		for ( int i =0; i<size();i++)
		{
			System.out.println(Temp.Data);
			Temp=Temp.next;} //end for loop
	}//end printList
	
	public boolean search (T key) {
		Node<T> Temp = head;
		for ( int i =0; i<size;i++)
		{if (key == Temp.Data)
			return true;
		else
			Temp=Temp.next;}//end for loop
		return false;
		} //end search
	
	public T Retrieve_sp ( int pos) {
		if (pos <= size )
		{Node<T> Temp = head;
		for ( int i =0; i<pos-1;i++)
			Temp=Temp.next;
			return Temp.Data;}//end if
		else
			System.out.println("out of bound");
		return null;
	}// end Retrieve_sp
	
}//end class
