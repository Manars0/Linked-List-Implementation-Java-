package linkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> Names = new LinkedList<String>();
		Names.addLast("Manar");
		Names.addLast("Fay");
		Names.addLast("Haya");
		
		Names.printList();
		System.out.println(Names.size());
		System.out.println(Names.search("nouf"));
		
		
		/*LinkedList<Integer> L = new LinkedList<Integer>();
		L.addLast(1);
		L.addLast(2);
		L.addLast(3);

		System.out.println(L.search(7));
		
		L.addFirst(1);
		
		System.out.println("Is the list empty? " +L.isEmpty());
		System.out.println("The list contain "+ L.size()+ " Elements");
		System.out.println("The list: ");
		L.printList();
		System.out.println("The first element of the list is: "+ L.First());
		System.out.println("The last element of the list is: "+ L.Last());
		
		L.removeFirst();
		System.out.println("The list after removing the first element : ");
		L.printList();*/
		
		
	}

}
