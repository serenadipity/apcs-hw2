import java.io.*;
import java.util.*;

public class MergeSort2 {

    public int[] merge(int[] a, int[] b) {
	int[] deck = new int[a.length+b.length];
	int i=0;
	int m=0;
	int count=0;
	while (i < a.length && m < b.length) {
	    if (a[i] < b[m]) {
		deck[count] = a[i];
		count++;
		i++;
	    }
	    else {
		deck[count] = b[i];
		count++;
		m++;
	    }
	}

	while (i < a.length) {
	    deck[count] = a[i];
	    i++;
	    count++;
	}
	while (i < b.length) {
	    deck[count] = b[m];
	    m++;
	    count++;
	}

	return deck;
    }


    public static void main(String[] args) {
	MergeSort2 m = new MergeSort2();
	int[] a = {1,3,5,7,4,8,123};
	int[] b = {4,8,9,12,245};
	System.out.println(m.merge(a,b));
    }
}
