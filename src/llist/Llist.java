package llist;

public class Llist {
	int size;
	Node first;
	
	public Llist(){
		first = null;
		size = 0;
	}
	public void add(Object o){
		add(o, size);
	}
	public void add(Object o, int x){
		if(x >= size)
			x = size;
		if(x < 0){
			size++;
			return;
		}
		Node n = new Node(o);
		if(size == 0)
			first = n;
		else{
			Node cur = crawlTo(x);
			Node temp = cur.next;
			cur.next = n;
			n.next = temp;
		}
		size++;
	}
	public Object get(int x){
		if(x >= size || x < 0)
			return null;
			//error
		return crawlTo(x).it;
	}	
	public Node crawlTo(int x){
		Node cur = first;
		for (int i = 0; i < size; i++){
			if(cur.next == null || i == x)
				break;
			else cur = cur.next;
		}
		return cur;
	}
	public int size(){
		return size;
	}
	public void remove(int x){
		if (x >= size || x < 0)
			return;
			//handle error
		crawlTo(x-1).next = crawlTo(x+1);
		size--;
	}
	public boolean contains(Object o){
		for(int i = 0; i < size; i++){
			if (o.equals(crawlTo(i).it))
				return true;
		}
		return false;
	}
}
