import java.util.*;
public class Customer {    
    public int compare(Camera camOne, Camera camTwo) {
        int valueCamOne = camOne.computeValue();
        int valueCamTwo = camTwo.computeValue();        
        double price1 = camOne.price;
        double price2 = camTwo.price;        
        if (camOne.userRating == camTwo.userRating && valueCamOne == valueCamTwo && Math.abs(price1 - price2) < 0.01)
            return 0;        
        if (camOne.userRating == camTwo.userRating && Math.abs(price1 - price2) < 0.01) {
            if (valueCamOne > valueCamTwo)
                return 1;
            else
                return 2;
        }        
        if (valueCamOne == valueCamTwo && Math.abs(price1 - price2) < 0.01) {
            if (camOne.userRating > camTwo.userRating)
                return 1;
            else
                return 2;        
        }
        if (valueCamOne == valueCamTwo && camOne.userRating == camTwo.userRating) {
            if (price1 < price2)
                return 1;
            else
                return 2;
        }        
        double cam1ratio = price1 / valueCamOne;
        double cam2ratio = price2 / valueCamTwo;
        if (cam1ratio > cam2ratio) 
            return 2;
        else if (cam1ratio < cam2ratio) 
            return 1;
        else
            return 0;        
    }    
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter attributes of Camera 1:");        
        System.out.println("Is WiFi enabled? (true/false)");
        boolean wifi1 = scanner.nextBoolean();        
        System.out.println("Is water resistant? (true/false)");
        boolean water1 = scanner.nextBoolean();        
        System.out.println("Is GPS enabled? (true/false)");
        boolean gps1 = scanner.nextBoolean();        
        System.out.println("Condition? (New/Refurbished/Used)");
        String condition1 = scanner.next();        
        System.out.println("Enter price in $ (0.00 to 1000.00)");
        double cameraPrice1 = scanner.nextDouble();        
        System.out.println("Enter user rating (0 to 5)");
        int rating1 = scanner.nextInt();        
        System.out.println("======================");        
        System.out.println("Enter attributes of Camera 2:");       
        System.out.println("Is WiFi enabled? (true/false)");
        boolean wifi2 = scanner.nextBoolean();        
        System.out.println("Is water resistant? (true/false)");
        boolean water2 = scanner.nextBoolean();       
        System.out.println("Is GPS enabled? (true/false)");
        boolean gps2 = scanner.nextBoolean();       
        System.out.println("Condition? (New/Refurbished/Used)");
        String condition2 = scanner.next();       
        System.out.println("Enter price in $ (0.00 to 1000.00)");
        double cameraPrice2 = scanner.nextDouble();        
        System.out.println("Enter user rating (0 to 5)");
        int rating2 = scanner.nextInt();        
        System.out.println("======================");        
        Camera camera1 = new Camera(wifi1, water1, gps1, condition1, cameraPrice1, rating1);
        Camera camera2 = new Camera(wifi2, water2, gps2, condition2, cameraPrice2, rating2);        
        Customer customer = new Customer();
        int result = customer.compare(camera1, camera2);       
        System.out.println("Result of Comparison");       
        if (result == 1)
            System.out.println("Camera 1 is better than Camera 2");
        if (result == 2)
            System.out.println("Camera 2 is better than Camera 1");
        else
            System.out.println("Camera 1 and Camera 2 are the same");   
    }
}