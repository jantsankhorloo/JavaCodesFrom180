import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.*;

public class NumericFinderGUI {
    String fileName = "";
    
    public NumericFinderGUI() {
        
        do {
            try{
                JFileChooser f = new JFileChooser();
                f.setFileSelectionMode(JFileChooser.DIRECTORY_ONLY);
                int val = f.showSaveDialog(null);
                fileName = f.getSelectedFile().getName();
                
                if (val == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = f.getSelectedFile();
                    System.out.println(selectedFile.getParentFile());
                    System.out.println(selectedFile.getName());
                }   
            } catch (IOException ioe) {
                System.out.println("Select a valid input file.");
            }
        } while (val == JFileChooser.CANCEL_OPTION);
        
    }
    
    void showNumeric() {
        
        ArrayList<String> list = new ArrayList<>();
        
        try { 
            File f = new File(fileName);
            Scanner scanner = new Scanner(f);
            while (scanner.hasNext()) {
                
                if (scanner.hasNextInt()) {
                    String x = "Integer: " + scanner.nextInt();
                    list.add(x);           
                }            
                else if (scanner.hasNextDouble()) {
                    String y = "Double: " + scanner.nextDouble();
                    list.add(y);
                }  
                else {
                    scanner.next();
                }
            }
            scanner.close(); 
            
            String[] array = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                array[i] = list.get(i);
            }
            
            JOptionPane.showMessageDialog(null, array);
            
            
        } catch (IOException ioe) {
            System.out.println("File does not exist. Provide a valid filename.");
        }
        
    }
}

