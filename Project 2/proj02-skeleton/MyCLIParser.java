import java.util.Scanner;

public class MyCLIParser {
    
    public static void main(String[] args) {
        // if no arguments, print help and return
        if (args.length == 0) {
            help(args);
            return;
        }
        //-help
        else if (args[0].equals("-help"))  help(args);
        //-add
        else if (args[0].equals("-add"))   add(args);
        //-sub
        else if (args[0].equals("-sub"))   sub(args);
        //-mul
        else if (args[0].equals("-mul"))   mul(args);
        //-div
        else if (args[0].equals("-div"))   div(args);
        //-stats
        else if (args[0].equals("-stats")) stats(args);
        //-seq
        else if (args[0].equals("-seq")) seq(args);
    }
    
    public static boolean isInteger(String str) {
        Scanner scanner = new Scanner(str);
        return scanner.hasNextInt();        
    }
    
    public static boolean checkCount1(String[] args) {
        boolean result = true;        
        
        if (args.length <= 1) {
            result = false;
        }            
        return result;
    }
    
    public static boolean checkCount2(String[] args) {
        boolean result = true;        
        
        if (args.length != 3) {
            result = false;
        }
        return result;                
    }   
    
    public static boolean checkType(String[] args) {
        boolean result = true;
        for (int i = 1; i < args.length; i++) {
            if (isInteger(args[i]) == false) {
                result = false;
                break;  
            }
        }
        return result; 
    }
    
    private static void help(String[] args) {
        System.out.println("-add");
        System.out.println("-sub");
        System.out.println("-mul");
        System.out.println("-div");
        System.out.println("-stats");
        System.out.println("-seq");
    }
    
    private static void add(String[] args) {
        
        if (checkType(args) == false) {
            System.out.println("Error: Argument type mismatch");
        }
        
        else if (checkCount1(args) == false) {
            System.out.println("Error: Argument count mismatch");
        }
        
        else {
            int sum = 0;
            for (int i = 1; i < args.length; i++) {
                sum += Integer.parseInt(args[i]); 
            }
            System.out.println(sum % 97); 
        }                        
    }
    
    private static void sub(String[] args) {
        if (checkType(args) == false) {
            System.out.println("Error: Argument type mismatch");
        }
        
        else if (checkCount2(args) == false) {
            System.out.println("Error: Argument count mismatch");
        }        
        
        else {
            int result = 0;
            result = Integer.parseInt(args[1]) - Integer.parseInt(args[2]);
            System.out.println(result);
        }
    }
    
    private static void mul(String[] args) {
        if (checkType(args) == false) {
            System.out.println("Error: Argument type mismatch");
        }
        
        else if (checkCount1(args) == false) {
            System.out.println("Error: Argument count mismatch");
            
        }        
        
        else {
            int sum = 1;
            
            for (int i = 1; i < args.length; i++) 
                sum = sum * Integer.parseInt(args[i]);        
            System.out.println(sum % 97);
        }
    }
    
    private static void div(String[] args) {
        if (checkType(args) == false) {
            System.out.println("Error: Argument type mismatch");
        }
        
        else if (checkCount2(args) == false) {
            System.out.println("Error: Argument count mismatch");
        }
        
        else if (Integer.parseInt(args[2]) == 0) {
            System.out.println("Undefined");
        }
        else {
            int quotient = Integer.parseInt(args[1]) / Integer.parseInt(args[2]);
            int remainder = Integer.parseInt(args[1]) % Integer.parseInt(args[2]);
            System.out.println("Quotient " + String.valueOf(quotient));
            System.out.println("Remainder " + String.valueOf(remainder));
        }
    }
    
    
    private static void stats(String[] args) {
        if (checkType(args) == false) {
            System.out.println("Error: Argument type mismatch");
        }
        
        else if (checkCount1(args) == false) {
            System.out.println("Error: Argument count mismatch");
        }
        
        else {
            int sum = 0;
            double counter = 0;
            double average = 0.0;
            int max = Integer.parseInt(args[1]);
            int min = Integer.parseInt(args[1]);
            
            for (int i = 1; i < args.length; i++) {
                
                sum += Integer.parseInt(args[i]);
                counter++;
                if (max < Integer.parseInt(args[i])) {
                    max = Integer.parseInt(args[i]);
                }
                if (min > Integer.parseInt(args[i])) {
                    min = Integer.parseInt(args[i]);
                }
                average = sum / counter;
            }
            
            System.out.println("Total " + String.valueOf(sum));
            System.out.println("Max " + String.valueOf(max));
            System.out.println("Min " + String.valueOf(min));
            System.out.print("Average ");
            System.out.printf("%.2f\n", average);        
        }
    }
    
    private static void seq(String[] args) {
        if (checkType(args) == false) {
            System.out.println("Error: Argument type mismatch");
        }
        
        else if (checkCount2(args) == false) {
            System.out.println("Error: Argument count mismatch");
        }        
        
        else {
            int number = Integer.parseInt(args[1]);
            int difference = Integer.parseInt(args[2]);
            
            
            System.out.print(args[1] + " ");
            
            for (int i = 1; i < 10; i++) {
                number += difference;
                System.out.print(String.valueOf(number) + " ");               
            }
            System.out.println("");
        }
    }
}

