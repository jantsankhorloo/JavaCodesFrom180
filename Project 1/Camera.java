public class Camera {   
    boolean hasWiFi;
    boolean isWaterResistant;
    boolean hasGPS;
    String condition;
    double price;
    int userRating;
    public Camera(boolean hasWiFi, boolean isWaterResistant, 
                  boolean hasGPS, String condition, double price, int userRating) {
        this.hasWiFi = hasWiFi;
        this.isWaterResistant = isWaterResistant;
        this.hasGPS = hasGPS;
        this.condition = condition;
        this.price = price;
        this.userRating = userRating;   
    }   
    public int computeValue() {        
        int value = 0;        
        if (this.hasWiFi == true)
            value += 1;
        if (this.isWaterResistant == true)
            value += 1;
        if (this.hasGPS == true)
            value += 1;
        if (this.condition.equals("New"))
            value += 2;
        if (this.condition.equals("Refurbished"))
            value += 1;
        if (this.condition.equals("Used"))
            value = value;        
        return value;      
    }
}

