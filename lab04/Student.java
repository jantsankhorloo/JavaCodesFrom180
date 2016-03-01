/**
 * CS180 - Lab 04 - Student
 *
 * Calculating the final grade of a student in Astro 102
 *
 * @author Jantsankhorloo Amgalan jamgalan@purdue.edu
 *
 * @lab L05
 *
 * @version 04/02/2015
 */

public class Student {
    
    String id;
    String dept;
    int abs;
    int exam;
    int part;
    
    /**
     * Student Class Constructor: Creates a new instance of the Student Class;
     * initializes instance variables with the given arguments:
     *
     * @param id - the student's ID
     * @param dept - the student's dept
     * @param abs - the students absences
     * @param exam - the student's exams grades
     * @param part - the student's participation
     */ 
    public Student(String id, String dept, int abs, int exam, int part) {
        
        this.id = id;
        this.dept = dept;
        this.part = part;
        this.abs = abs;
        this.exam = exam;
        
    }
    
    /**
     * Computes sum of the participation, exam, and absences point
     */
    
    public int getOverallScore() {
        int totScore; //the total score
        int attendanceScore = 0;
        
        if (this.abs == 0)
            attendanceScore = 2;
        else if (this.abs >= 1 && this.abs <= 4)
            attendanceScore = 0;
        else
            totScore = 0;
        
        totScore = this.exam + this.part + attendanceScore;
        return totScore;
    }
    
    /**
     * Returns letter grade based on the score passed in input
     */
    
    
    public String getLetterGrade(int score) {
        
        
        String letterGrade = "";
        
        if (abs >= 5 || score < 60) 
            letterGrade = "F";   
        else if (score >= 95)
            letterGrade = "A+";
        else if (score >= 90)
            letterGrade = "A";
        else if (score >= 80)
            letterGrade = "B";
        else if (score >= 70)
            letterGrade = "C";
        else
            letterGrade = "D";            
        
        
        return letterGrade;
    }
    
    /**
     * two different cases: Phys major or CS major
     * 4 cases in total: CS and Phys student passing grade 
     * and their both failing grade
     */
    
    public boolean hasPassedCourse(String letterGrade) {
        
        if (this.dept.equals("CS")) {
            if (letterGrade == "F")
                return false;
            else
                return true;
        }
        
        else {
            switch (letterGrade) {
                case "A": case "B": case "A+": 
                    return true;

                case "C": case "D": case "F": 
                    return false;
                    
                default: return false;

            }
        
        }
    }
    
    public static void main(String[] args) {
        //Create a Phys Student
        Student s = new Student("1020101", "CS", 4, 60, 5);
        
        //Get overall score
        int totScore = s.getOverallScore();
        
        //Get Grade from score
        String grade = s.getLetterGrade(totScore);
        
        //Get pass or fail result
        boolean result = s.hasPassedCourse(grade);
        
        //Print short report of student
        System.out.println(s.id);
        System.out.println("Score: " + totScore);
        System.out.println("Grade: " + grade);
        
        if (result == true)
            System.out.println("Student " + s.id + "has passed the course");
        else
            System.out.println("Student " + s.id + "has failed the course");
    }    
    
}