/*
select(kth, L, size);

1. select a pivot value
2. rearrange list such that all values left of pivot are < pivot & all to the right are > than pivot.
3. select(k,L, size -->choose these to reflect the size of the list you are working with)
*/

import java.io.*;
import java.util.*;

public class Select {

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

    public String toString(int[] D) {
	String s = "";
	for (int i=0; i < D.length;i++) {
	    s+=D[i] + ", ";
	}
	return s;
    }

    public static void main(String[] args) {
	Select s = new Select();
	int[] L = {1, 2, 5, 7, 8, 9, 12, 25, 56, 73};
	System.out.println(s.toString(s.pivot(L,2,8)));
    }
}
