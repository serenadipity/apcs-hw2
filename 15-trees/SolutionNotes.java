public int Diam(Node T) {
    if (t==null)
	return 0;
    else {
	pl1 = height(T.getLeft() + height(T.getRIght()) + L);
	pl2 = Diam(T.getLeft());
	pl3 = Diam(T.getRight());
	return max(pl1,pl2,pl3);
    }
}

minHeap (root always holds smallest value)
1. Binary Tree
2. Parent is smaller than either child
3. As full as possible left to right

removemin() {
1. pull off root
2. move lowest rightest value to row
3. pushdown (root)
    while node either ???
