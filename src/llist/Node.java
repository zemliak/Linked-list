package llist;

public final class Node {
	Object it; 
	Node next;
	Node previous;
	public Node(Object that){
		this.it = that;
		next = null;
		previous = null;
	}
	public Node(Object that, Node next){
		this(that);
		this.next = next;
	}
	public Node(Object that, Node next, Node previous){
		this(that);
		this.next = next;
		this.previous = previous;
	}
	/*public static void main(String [] args){
		Integer i1 = new Integer(4);
		Integer i2 = new Integer(5);
		Integer i3 = new Integer(6);
		Node n1 = new Node(i1);
		Node n2 = new Node(i2);
		Node n3 = new Node(i3);
		n1.setNext(n2);
	}*/
}