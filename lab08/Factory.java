public class Factory {
     
    public static void main(String[] args) {
        
        SorterFirstGeneration sort = new SorterFirstGeneration();
        PiecesFactory fact = new PiecesFactory();
        
        String[] triangleSpecs = fact.getNext();
        
        while (triangleSpecs != null) {
            triangleSpecs = fact.getNext();
           
            if (triangleSpecs[0].equals("S")) {
                Triangle n = new Triangle(Integer.parseInt(triangleSpecs[1]),
                                          Integer.parseInt(triangleSpecs[2]), 
                                          Integer.parseInt(triangleSpecs[3])); 
                sort.sort(n);
            }
            
            else if (triangleSpecs[0].equals("A")) {
                Triangle n = new Triangle(Integer.parseInt(triangleSpecs[1]),
                                          Integer.parseInt(triangleSpecs[2]), 
                                          Integer.parseInt(triangleSpecs[3]));   
                sort.sort(n);
            }
            
            /* get the next specifications */
            triangleSpecs = fact.getNext();
        }        
        sort.printStatistics();
    }
}