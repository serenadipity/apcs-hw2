
public boolean remove(int n) {
    Node T = t;
    while(T != null) {
	if (T.getNext().getData() == n) {
	    T.setNext(T.getNext().getNext());
	    return true;
	}
	return false;
    }
}


// piggybacking pointers
public boolean remove(int n) {
    Node T = L.getNext();
    Node T2 = L;
    while (T != null) {
	if (T.getData() == n) {
	    T2.setNext(T.getNext());
	    return true;
	}
	T2 = T;
	T = T.getNext();
    }
    return false;
}
