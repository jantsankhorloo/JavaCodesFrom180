package lab15;

public class Power {
	public static int power(int a, int b) {
		if (b == 0) {
			return 1;
		}
		return a * power(a, b - 1);
	}
	
	public static int power2(int a, int b) {
	    int total = 1;
	    for(int i = 0; i < b; i++) {     
	    	total *= a;
	    }
	    return total;
	    
	}
	
	public static void main(String[] args) {
		System.out.println(Power.power(3, 3));
		System.out.println(Power.power2(3, 3));
	}
}
