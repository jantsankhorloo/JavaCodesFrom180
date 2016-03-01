import java.util.Scanner;

/**
 * CS180 - Lab 02
 * Explain briefly the functionality of the program.
 * @author Jantsankhorloo Amgalan, jamgalan@purdue.edu
 */
 
public class Pythagoras {
    
    public static void main(String[] args) {
        
        Pythagoras p = new Pythagoras();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter side 'a': ");
        int a = scanner.nextInt();
        
        System.out.print("Enter side 'b': ");
        int b = scanner.nextInt();
        
        double h = p.getHypotenuse(a, b);
        System.out.println("Hypotenuse: " + h);
        
    }
    
    public double getHypotenuse(int a, int b) {
        
        double result;
        result = Math.sqrt(a * a + b * b);
        return result;
    }
}