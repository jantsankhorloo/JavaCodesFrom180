public class Calculator {
    public int add(int a, int b) {        
        return a + b;  
    }
    
    public int div(int num, int den) {
        if (den == 0)
            return num;
        else
            return num / den;
    }
}

