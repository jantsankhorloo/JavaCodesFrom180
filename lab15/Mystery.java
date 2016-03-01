package lab15;

public class Mystery {
	public static int mysterySeries(int i, int j) {
		if (i < 0 || j < 0 || i < j) {
			return 0;
		}
		
		if (i == j || j == 0) {
			return 1;
		}
		
		return mysterySeries(i - 1, j - 1) + mysterySeries(i - 1, j);
	}
	
	public static void main(String[] args) {
		System.out.println(Mystery.mysterySeries(6, 2));
	}
}
