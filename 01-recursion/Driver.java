
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
  		int len = sub.length();
  		if (str.length() < len) return 0;
  		if (str.substring(0, len).equals(sub)) {
     		return 1 + strCount(str.substring(len), sub);
  		}
  		else {
     		return strCount(str.substring(1), sub);
  		}
	}
	
	public int sumDigits(int n) {
  		if (n < 10) {
  			return n;
  		}
  		else {
  			return (sumDigits(n / 10) + sumDigits(n % 10));
  		}
	}
	
	public String allStar(String str) {
  		if (str.length() < 2) return str;
  		return str.charAt(0) + "*" + (allStar(str.substring(1)));
	}

	public static void main(String[] args) {
		Driver d = new Driver();
		System.out.println(d.fibonacci(5));
		System.out.println(d.bunnyEars2(7));
		System.out.println(d.strCount("qweabcdewabc", "abc"));
		System.out.println(d.sumDigits(23958));
		System.out.println(d.allStar("hello"));
	}

}
