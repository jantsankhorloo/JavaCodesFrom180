public class Triangle {
    private double l1;
    private double l2;
    private double l3;
    
    private double angle1;
    private double angle2;
    private double angle3;
        
    public Triangle(int l1, int l2, int l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;       
        
        //double angle3 = Math.acos((Math.pow(l1, 2) + Math.pow(l2, 2) - Math.pow(l3, 2)) / (2 * l1 * l2));
        //double angle2 = Math.acos((Math.pow(l1, 2) + Math.pow(l3, 2) - Math.pow(l2, 2)) / (2 * l1 * l3));
        //double angle1 = Math.acos((Math.pow(l2, 2) + Math.pow(l3, 2) - Math.pow(l1, 2)) / (2 * l2 * l3));
        
        //this.angle3 = angle3;
        //this.angle2 = angle2;
        //this.angle1 = angle1;                
    }
    
    public Triangle(int l1, int l2, double angle3) {
        this.l1 = l1;
        this.l2 = l2;
        this.angle3 = Math.toRadians(angle3);
        
        //double l3 = Math.sqrt(Math.pow(l1, 2) - 2 * l1 * l2 * Math.cos(angle3) + Math.pow(l2, 2));
        
        //this.l3 = l3;
        
        //double angle1 = Math.acos((Math.pow(l2, 2) + Math.pow(l3, 2) - Math.pow(l1, 2)) / (2 * l2 * l3));
        //double angle2 = Math.acos((Math.pow(l1, 2) + Math.pow(l3, 2) - Math.pow(l2, 2)) / (2 * l1 * l3));
        
        //this.angle1 = angle1;
        //this.angle2 = angle2;
    }
    
    public double perimeter() {
        return (this.l1 + this.l2 + this.l3);
    }
    
    public double area() {
        return (0.5 * l1 * l2 * Math.sin(Math.toRadians(angle3)));
    }
    
    public static double area(double l1, double l2, double angle) {
        return (0.5 * l1 * l2 * Math.sin(Math.toRadians(angle)));
    }
    
    /**
     * This functions computes the included angles of a triangle
     *
     * @param adj1 one of the adjacent side
     * @param adj2 the other adjacent side
     * @param opp the opposite side
     */
    public static double angleFromSides(double adj1, double adj2, double opp) {
        double pythagoras = opp * opp - adj1 * adj1 - adj2 * adj2;
        return Math.acos(-pythagoras/(2*adj1*adj2));
    }
    
    /**
     * This functions computes the length of the opposite side
     *
     * @param angle the included angle
     * @param adj1 one of the adjacent side
     * @param adj2 the other adjacent side
     */
    public static double oppSide(double angle, double adj1, double adj2) {
        return Math.sqrt(adj1 * adj1 - 2 * adj1 * adj2 * Math.cos(angle) + adj2 * adj2);
    }
    
}
