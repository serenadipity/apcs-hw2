
public class Driver {
    
    public int fibonacci(int n) {
	if (n == 0) {
	    return 0;
	}
	if (n == 1) {
	    return 1;
	}
	else {
	    return fibonacci(n-1) + fibonacci(n-2);
	}
  
    }

    public int bunnyEars2(int bunnies) {
	if (bunnies == 0) {
	    return 0;
	}
	else {
	    if (bunnies % 2 == 0) {
		return 3 + bunnyEars2 (bunnies - 1);
	    }
	    else {
		return 2 + bunnyEars2 (bunnies - 1);
	    }
	}
    }


    public int strCount(String str, String sub) {
	if (str.length() < sub.length) {
	    return 0;
	}
	if (str.equals(sub)) {
	    return 1;
	}
	else {
	}
    }

}
