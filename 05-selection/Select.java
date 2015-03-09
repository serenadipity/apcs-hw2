
import java.io.*;
import java.util.*;

public class Select {

    /*
    public int[] pivot (int[] L, int SI, int EI) {
	int[] D = new int[L.length];
	for (int i=0; i < L.length; i++) {
		D[i] = L[i];
	}
	int p = L[SI];
	D[SI] = p;
	for (int k = SI+1; k < EI; k++) {
	    if (L[k] < p) {
		D[SI]=L[k];
		SI++;		
	    }
	    else {
		D[EI]=L[k];
		EI--;
	    }	 
	}
	return D;
    }

    */
    /*
    public String toString(int[] D) {
	String s = "";
	for (int i=0; i < D.length;i++) {
	    s+=D[i] + ", ";
	}
	return s;
    }
    */

    public int selection(int[] A, int k, int l, int h) {
	int pivot = A[k];
	int hh = h;
        int hi = h-1;
	int li = l;
	
	A[h] = A[pivot];
	A[pivot] = A[hh];
	
	while (hi>li) {
	    if (A[li] < pivot) {
		li++;
	    }
	    else {
		int r = A[li];
		A[li] = A[hi];
		A[hi] = r;
		hi--;
	    }
	}
	
	if (k==pivot) {
	    return 0;
	}
	else {
	    selection(A, k, l, pivot-1);
	    selection(A, k, pivot+1, h);
	}
	
	return A[k];
    }


    public static void main(String[] args) {
	Select s = new Select();
	int[] L = {1, 2, 5, 7, 8, 9, 12, 25, 56, 73};
	System.out.println(s.selection(L,2,1,8));
    }
}
