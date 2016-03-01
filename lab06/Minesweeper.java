import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
  
    private int rows;
    private int columns;
    private int[][] clueGrid;
    private boolean[][] checked;
    private boolean[][] mineField;    
    
    public Minesweeper(int rows, int columns, int mines) {
        this.rows = rows;
        this.columns = columns;
        
        mineField = new boolean[rows][columns];
        checked = new boolean[rows][columns];
        clueGrid = new int[rows][columns];
        
        generateMinefield(mines);
        
        generateClueGrid();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                checked[i][j] = false;
        }
        
    }
    
    public void generateMinefield(int mines) {               

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                mineField[i][j] = false;
        }
        
        Random random = new Random(System.currentTimeMillis());  
        
        while (mines > 0) {
            int r = random.nextInt(rows);
            int c = random.nextInt(columns);
            
            if (mineField[r][c])
                continue;
            else
                mineField[r][c] = true;
            
            mines--;        
        }          
    }
    
    public void generateClueGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (mineField[i][j] == true)
                    clueGrid[i][j] = countMines(i, j);
                clueGrid[i][j] = -1; 
            }
        }
    }
    
    public int countMines(int row, int columns) {
        int result = 0;
        
        for (int r = Math.max(row - 1, 0); r <= Math.min(row + 1, row - 1); r++) 
            for (int c = Math.max(columns - 1, 0); c <= Math.min(columns + 1, columns - 1); c++)
                if (!(r == rows & c == columns)) {
                   if (mineField[r][c] == true)
                       result++;
            }
        return result;                   
    }
    
    
    public void printBoard() {
     
        System.out.println("     ");
        for (int j = 0; j < columns; j++)
            System.out.print("  " + (j + 1));
        System.out.println();
        
        System.out.print("  +-");
        for (int j = 0; j < columns; j++)
            System.out.print("--");
        System.out.println();
        
        char row_letter = 'A';
        for (int i = 0; i < rows; i++) {
            System.out.print(row_letter + " |");
            for (int j = 0; j < columns; j++) {
                char cell_symbol;
                if (!checked[i][j])
                    cell_symbol = '?';
                else if (mineField[i][j])
                    cell_symbol = '*';
                else if (clueGrid[i][j] > 0)
                    cell_symbol = (char)('0' + clueGrid[i][j]);
                else
                    cell_symbol = ' ';
                System.out.print(" " + cell_symbol);
            }
            System.out.println();
            row_letter++;
        }   
    }
    
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean win = false;
        
        while (!win) {
            printBoard();
            System.out.print("Check cell? ");
            String line = scanner.nextLine().toUpperCase();
            int row = line.charAt(0) - 'A';
            int column = line.charAt(1) - '1';
            
            if (mineField[row][column])
                break;
            else {
                checked[row][column] = true; 
                
                if (clueGrid[row][column] == 0) {
                for (int r = Math.max(row - 1, 0); r <= Math.min(row + 1, row - 1); r++) {
                    for (int c = Math.max(columns - 1, 0); c <= Math.min(columns + 1, columns - 1); c++) {
                    
                    }            
                }
                }
            }
        }
            win = true;
            
            for (int i = 0 ; i < rows && win; i++) {
                for (int j = 0; j < columns && win; j++) {
                    if (!checked[i][j] && !minefield[i][j])
                        win = false;
                }
            }   
        
            if (clueGrid[row][column] == 0) {
                for (int r = Math.max(row - 1, 0); r <= Math.min(row + 1, row - 1); r++) {
                    for (int c = Math.max(columns - 1, 0); c <= Math.min(columns + 1, columns - 1); c++) {
                    
                    }            
                }
            } 
        
        }
        


        scanner.close();
        
        for (int i = 0; i < rows; i++) 
             for (int j = 0; j < columns; j++)
                 checked[i][j] = true;
        printBoard();
        
        if (win)
            System.out.println("\nYou win!");
        else
            System.out.println("\nYou are not very good at this, are you?");
    }
    
    public static void main(String[] args) {
        Minesweeper m = new Minesweeper(5,5,1);
        m.start();
    }
}
