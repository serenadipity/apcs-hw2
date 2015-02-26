import java.io.*;
import java.util.*;

public class MergeSort {

    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	ArrayList<Integer> deck = new ArrayList<Integer>();
	int half = 0;
	int half2 = 0;
	while (half < a.size() && half2 < b.size()){
	    if (a.get(half) < b.get(half2)) {
		deck.add(a.get(half));
		half++;
	    }
	    else {
		deck.add(b.get(half2));
		half2++;
	    }
	}

	while (half < a.size()) {
	    deck.add(a.get(half));
	    half++;
	}

	while (half2 < b.size()) {
	    deck.add(b.get(half2));
	    half2++;
	}

	return deck;
    }

    public static void main(String[] args){
	MergeSort m = new MergeSort();
	ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,24,72,98));
	ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(0,9,12,51,65,78,102));
	System.out.println(m.merge(a,b));
    }
   
}
