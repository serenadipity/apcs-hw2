public class LList{
    private Node l=null;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }
		
    public String toString(){
	String s = "";
	Node tmp;
	for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public Node find(int n) {
	Node nd = l;
	while (n > 0) {
	    nd = nd.getNext();
	    n--;
	}
	return nd;
    }

    public void insert(int n, String s) {
        if (n==0) {
	    add(s);
	}
	else {
	    Node tmp = l;
	    for (int i=0; i<n-1; tmp=tmp.getNext()) {
		i++;
	    }
	    Node tmp2 = new Node(s);
	    tmp2.setNext(tmp.getNext());
	    tmp.setNext(tmp2);
	}
    }
}
