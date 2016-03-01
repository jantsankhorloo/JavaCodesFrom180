import java.util.Scanner;

/**
 * CS180 - Lab 03 - String Manipulator
 * 
 * This generates an e-mail address from a student's full name.
 * 
 * @author Jantsankhorloo Amgalan <jamgalan@purdue.edu>
 * 
 * @lab L05
 * 
 * @date Jan 28, 2015
 */

public class StringManipulator {
    /**
     * @param fullName contains the person's
     * first and last name separated by a space
     * @return user name
     */
    public String makeUserName(String fullName) {
        fullName = fullName.toLowerCase();
        int whitespace = fullName.indexOf(" ");
        String lastname = fullName.substring(whitespace+1);
        String username = fullName.charAt(0) + lastname;        
        return username;
    }
    
    public String makeEmail(String userName, String domain) {
        domain = domain.toLowerCase();
        String email = userName + "@" + domain;
        return email;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter Domain: ");
        String domain = scanner.nextLine();
        
        StringManipulator x = new StringManipulator();
        
        String givenName = x.makeUserName(fullName);
        String newEmail = x.makeEmail(givenName,domain);
        System.out.println("The user name for the person is: " + givenName);
        System.out.println("The email id for the person is: " + newEmail);
    }
    
}


