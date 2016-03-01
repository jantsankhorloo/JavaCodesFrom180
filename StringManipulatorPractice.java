import java.util.Scanner;

public class StringManipulatorPractice {

    public String makeInitial(String firstName, String lastName) {
        String initials = firstName.charAt(0) + "&" + lastName.charAt(0);      
        return initials;
    }
    
    public String makeEmail(String firstName, String lastName, String date) {
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String resultdate = day.concat(month);
        
        String email = String.valueOf(firstName.charAt(0)) + String.valueOf(lastName.charAt(0)) + resultdate + "@gmail.com";
        
        return email;
    }
    
    
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter your date of birth (MM-DD-YY): ");
        String date = scanner.nextLine();
        
        
        StringManipulatorPractice x = new StringManipulatorPractice();
        
        String initials = x.makeInitial(firstName, lastName);
        System.out.println("Your initials are: " + initials);
        
        String newEmail = x.makeEmail(firstName, lastName, date);      
        System.out.println("Your email id is: " + newEmail);
    }
    
}