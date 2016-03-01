public class SorterThirdGeneration {
    private Triangle[] small;
    private Triangle[] medium;
    private Triangle[] large;

    private int nSmall;
    private int nMedium;
    private int nLarge;

    public SorterFirstGeneration() {
        this.small = new Triangle[5];
        this.medium = new Triangle[5];
        this.large = new Triangle[5];
        
        this.nSmall = 0;
        this.nMedium = 0;
        this.nLarge = 0;
    }

    /**
     * Add the triangle in the good container and update the statistics.
     */
    public void sort(Triangle p) {
        if (p.area() < 10)
            small[nSmall++] = p;            
        else if (p.area() > 10 && p.area() < 50)
            medium[nMedium] = p;
        else
            large[nLarge] = p;               
    }
    
    public void printStatistics() {
        System.out.printf("There are currently %d triangles in stock:\n", this.nSmall + this.nMedium + this.nLarge);
        System.out.printf(" - %d small %n", this.nSmall);
        System.out.printf(" - %d medium %n", this.nMedium);
        System.out.printf(" - %d large %n%n", this.nLarge);
    }
}