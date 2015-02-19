package llist;

public final class Node {
	Object it; 
	Node next;
	Node previous;
	public Node(Object that){
		this(that, null, null);
	}
	public Node(Object that, Node next){
		this(that, next, null);
	}
	public Node(Object that, Node next, Node previous){
		this.it = that;
		this.next = next;
		this.previous = previous;
	}
}
