public class Coor{
    private int x, y;
    private Coor p;
    public Coor(int i, int j, Coor c){
	x= i;
	y = j;
	p = c;
    }
    public Coor(int n, int m){
	x= n;
	y = m;
	p = null;
    }
    public Coor getPrev(){
	return p;
    }
    public int getX(){
	return x;
    }
    public int getY(){
	return y;
    }
		  

}
