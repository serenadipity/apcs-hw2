public class Driver{
    public static void main(String[] args) {
	LList l = new LList();
	l.add("hello");
	l.add("world");
	for (int i=0;i<5;i++){
	    l.add(""+i);
	}
	System.out.println(l);

	l.insert(0,"a");
	System.out.println(l);
	l.insert(1,"b");
	System.out.println(l);
	l.insert(4,"d");
	System.out.println(l);
	l.remove(2);
	System.out.println(l);
       
    }
}
