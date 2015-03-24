public class myStack<E>{
    // You decide how the node(s) are declared

    // make whatever constructor(s) you need

    private Node<E> l;

    private Node top, bottom;

    public myStack(E s) {
	l = new Node(s);
	top = null;
	bottom = null;
    }

    public void push(E data){
        // add something to the top
	Node<E> tmp = new Node<E>(data);
        tmp.setNext(l.getNext());
	l.setNext(tmp);
	top = tmp;
    }

    public E pop(){
        // remove and return the top item from the stack
	Node tmp = top;
        top.getPrev().setNext(null);
	return tmp;
    }

    public boolean empty(){
	if (l = null) return true;
    }

    public E top() {
        // return the top item from the stack
	return top.getData();
    }
}
