public class BST {

    private Node r;

    public void insert(Node t, int i) {
	Node tmp = r;
        while (
	    

    }

    public Node search(Node t, int i) {
	Node tmp = r;
	while (t != null) {
	    int k = t.getData.compareTo(i);
	    if (k == 0) {
		return tmp;
	    }
	    else if (ph < 0) {
		tmp = tmp.getLeft();
	    }
	    else {
		tmp = tmp.getRight();
	    }
	}
	return null;
}
