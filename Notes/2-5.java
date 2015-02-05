//this function will print out "1 2 3 4"

public void printme(int n) {
    if (n > 0) {
	printme(n-1);
	System.out.println(n);
    }
}

/*Base Case ==> the simplest case (in terms of factorial,the base case is: 
n! = 1 if n = 0)
*/

public int factorial(int n) {
    if (n<=1)
	1;
    else {
	return n * factorial(n-1);
    }
}
