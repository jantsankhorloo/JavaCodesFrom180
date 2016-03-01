import java.util.Scanner;

/**
 * CS 180 - Lab 05 - Repetition
 * 
 * practicing while, do-while, and for loops
 * 
 * @author Jantsankhorloo Amgalan jamgalan@purdue.edu
 * 
 * @lab L05
 *
 * @version 11/02/2015
 */

public class Repetition {
    
    public static void main(String[] args) {
    
        Repetition test = new Repetition();
        Scanner scanner = new Scanner(System.in);
        
        even(); 
        System.out.println();
        powers();
        System.out.println();
        alphabet();
        System.out.println();        
        
        vertical(scanner.nextLine());
        
        System.out.println();
        testResults();
        System.out.println();
        sqrAndCude();
    
    }
    
    /**
     * Generate and print out all even numbers from 0 to 100 (inclusively) on the same line.
     * Output: 0 2 4 6 8 10 ... 98 100
     */
    public static void even() {
        
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
    
    /**
     *  1. Declare an integer named exp (short for exponent). Initialize it with value 0.
     *  2. Iterate over increased values of exp for every 2^(exp) less than 1000 
     *     (note that this is the loop exit condition).
     *  3. To get the value of 2^(exp), use the expression Math.pow(2, exp).
     * 
     * Output: 1.0 2.0 4.0 8.0 16.0 32.0 64.0 128.0 256.0 512.0
     */
    public static void powers() {
        int exp = 0;
        double result = 0;
        
        while (result < 1000) {
            result = Math.pow(2, exp);
            System.out.println(result);
            exp++;
        }
    
    }
    
    /**
     * Print out the alphabet using Characters and a 'for loop'.
     * Output: abcdefghijklmnopqrstuvwxyz
     */
    public static void alphabet() {
        String output = "";
        
        for(char i = 97; i < 123; i++) {
            output += i;
        }  
        
        System.out.println(output);
    }
    
    //Prints out every letter of the string s, each on its own line
    public static void vertical(String s) {
        
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }       
    }
    
    /**
     * min, max and average finder which 
     * accepts a sequence of integers from the user 
     */
    public static void testResults() {
        
        Scanner scanner = new Scanner(System.in);
        
        int n;
        int sum = 0;
        int index = 0;
        int min = 500;
        int max = 1;
        
        do {
            
            System.out.printf("Enter scores (between 1 and 500) now: ");
            n = scanner.nextInt();
            
            if (n <= min)
                min = n;
            if (n >= max)
                max = n;
            
            sum += n;
            index++;
        } while (scanner.hasNextInt());
        
        int average = sum / index;
        
        System.out.println("=====-----=====-----=====-----=====");
        System.out.println("=            Test Results         =");
        System.out.println("= Average:                      " + average + " =");
        System.out.println("= Lowest:                       " + min + " =");
        System.out.println("= Highest:                     "+ max + " =");
        System.out.println("=====-----=====-----=====-----=====");
      
    }
    
    public static void sqrAndCude() {
        
        for (int i = 1; Math.pow(i, 6) < 25000; i++) {
                
            double result = Math.pow(i, 6);
            System.out.println(result + " is the cube of " + Math.pow(result, 1/3) + 
                                   " and the square of " + Math.pow(result, 1/2));
        }
    }
}