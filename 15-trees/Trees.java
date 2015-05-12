public class Trees {
    
    private Node root;
    
    public Trees(Node r) {
	root = r;
    }
    
    public String toString(String s, Node n) {
        String str = "";
        if (n.getLeft() != null) {
            str += toString(s + "<",n.getLeft());
        }
        str += s + n + "\n";
        if (n.getRight() != null) {
            str += toString(s + ">",n.getRight());
        }
        return str;
    }
    
    public int maxValue() {
	return maxValue(root);
    }

    public int maxValue(Node n) {
	if (n == null) {
	    return 0;
	} else {
	    return Math.max(n.getValue(), Math.max(n.getLeft(), n.getRight()));
	}
    }

    public int height() {
	return height(root);
    }

    public int height(Node n) {
	if (n == null) {
	    return 0;
	} else {
	    return 1 + Math.max(height(n.getLeft()), height(n.getRight()));
	}
    }

    public void splitDupes() {
	splitDupes(root);
    }
    
    public void splitDupes(Node n) {
	if (n == null) {
	    return;
	} 
	if (n.getLeft() != null && n.getData() == n.getLeft().getData()) {
	    Node tmp = n.getLeft();
	    Node tmp2 = new Node(n.getData() - 1);
	    n.setLeft(tmp2);
	    setter.setLeft(tmp);
	}
	if (n.getRight() != null && n.getData() == n.getRight().getData()) {
	    Node tmp = n.getRight();
	    Node tmp2 = new Node(n.getData() - 1);
	    n.setRight(tmp2);
	    setter.setRight(tmp);
	}
	splitDupes(n.getLeft());
	splitDupes(n.getRight());
    }

    public int longest() {
	return longest(root, 0);
    }

    public int longest(Node n, int i) {
	if (n == null) {
	    return 0;
	} else {
	    
	    int current = height(n.getLeft()) + height(n.getRight()) + 1;
	    int l = longest(n.getLeft());
	    int r = longest(n.getRight());
	    
	    return Math.max(current, Math.max(l,r));
	}
    }
}
