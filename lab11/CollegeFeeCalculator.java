import javax.swing.JOptionPane;

/**
 * CS 180 - Lab 08 - CollegeFeeCalculator
 * 
 * (Brief description of the class file)
 * 
 * @author Jantsankhorloo Amgalan <(jamgalan@purdue.edu>
 * 
 * @lab L05
 *
 * @date April 1, 2015
 */

public class CollegeFeeCalculator {
    public static void main(String[] args) {
        do {
            JOptionPane.showMessageDialog(null, "Welcome to CollegeFeeCalculator"
                                              , "CollegeFeeCalculator", JOptionPane.INFORMATION_MESSAGE);
            
            String name = (String) JOptionPane.showInputDialog(null, "Please enter your name, then press OK"
                                                                   , "Name", JOptionPane.QUESTION_MESSAGE);
            
            String[] enrollmentOption = {"Full-Time","Part-Time"}; 
            
            String enrollment = (String) JOptionPane.showInputDialog(null, "Please select your enrollment"
                                                                         , "Enrollment", JOptionPane.QUESTION_MESSAGE
                                                                         , null, enrollmentOption, null);
            String creditHours = "";
            
            do{
                creditHours = (String) JOptionPane.showInputDialog(null, "Please enter the no. of credit hours, then press OK"
                                                                       , "Credit Hours", JOptionPane.QUESTION_MESSAGE); 
                if (enrollment.equals("Part-Time") && Integer.parseInt(creditHours) >= 8 
                        || enrollment.equals("Full-Time") && Integer.parseInt(creditHours) < 8) {
                    JOptionPane.showMessageDialog(null, "Please enter valid credit hours for the current enrollment"
                                                      , "Invalid no. of credits", JOptionPane.ERROR_MESSAGE);
                }
            } while (enrollment.equals("Part-Time") && Integer.parseInt(creditHours) >= 8 
                         || enrollment.equals("Full-Time") && Integer.parseInt(creditHours) < 8);
            
            String[] residencyStatus = {"In-state", "Out-of-state", "International"};
            String residency = (String) JOptionPane.showInputDialog(null, "Please select the appropriate residency"
                                                                        , "Residency", JOptionPane.QUESTION_MESSAGE
                                                                        , null, residencyStatus, null);
            
            String[] housingChoice = {"ON-Campus", "OFF-Campus"};
            String housing = (String) JOptionPane.showInputDialog(null, "Please select your housing"
                                                                      , "Housing", JOptionPane.QUESTION_MESSAGE
                                                                      , null, housingChoice, null);
            
            String dorm = "";
            String[] dormChoice = {"Earhart", "Hillenbrand", "Owen", "Windsor"};
            
            if (housing.equals("ON-Campus")) { 
                dorm = (String) JOptionPane.showInputDialog(null, "Please select the residence hall"
                                                                , "Residence-Hall", JOptionPane.QUESTION_MESSAGE
                                                                , null, dormChoice, null);
            }
            
            
            int residencyCost = 0;
            int housingCost = 0;
            int totalFee = 0;
            int perCredit = Integer.parseInt(creditHours);
            
            if (enrollment.equals("Part-Time")) {
                if (residency.equals("In-state")) {
                    residencyCost = 350 * perCredit;
                }
                else if (residency.equals("Out-of-state")) {
                    residencyCost = (600 + 350) * perCredit;
                }
                else {
                    residencyCost = (70 + 600 + 350) * perCredit;
                }
            }
            
            else if (enrollment.equals("Full-Time")) {
                if (residency.equals("In-state")) {
                    residencyCost = 4996;
                }
                else if (residency.equals("Out-of-state")) {
                    residencyCost = (9401 + 4996);
                }
                else {
                    residencyCost = (1000 + 9401 + 4996);
                }        
            }
            
            if (housing.equals("ON-Campus")) {
                if (dorm.equals("Earhart")) {
                    housingCost = 4745;
                }
                else if (dorm.equals("Hillenbrand")) {
                    housingCost = 5307;
                }
                else if (dorm.equals("Owen")) {
                    housingCost = 4130;
                }
                else {
                    housingCost = 4150;
                }      
            }
            
            else if (housing.equals("OFF-Campus")) {
                housingCost = 0;
            }       
            
            totalFee = residencyCost + housingCost;    
            
            JOptionPane.showMessageDialog(null, "Name: " + name + "\n" +
                                          "Credit Hours: " + creditHours + "\n" +
                                          "Enrollment: " + enrollment + "\n" +
                                          "Residency: " + residency + "\n" +
                                          "Tuition Fee: $" + Integer.toString(residencyCost) + "\n" +
                                          "Housing Expenses: $" + Integer.toString(housingCost) + "\n" +
                                          "Total Sem. Fee: $" + Integer.toString(totalFee),
                                          "CollegeFeeCalculator", JOptionPane.INFORMATION_MESSAGE);
            
            //int result = JOptionPane.showConfirmDialog(null, "Would you like to perform another fee calculation?"
                                                           //, "Are you done?", JOptionPane.YES_NO_OPTION);
        }
        while (JOptionPane.showConfirmDialog(null, "Would you like to perform another fee calculation?"
                                                           , "Are you done?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    } 
}