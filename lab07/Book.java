public class Book {
    private int number;
    private String name;
    private String category;
    private boolean availability = true;
    
    public Book(int number, String name, String category) {
        this.number = number;
        this.name = name;
        this.category = category;
        this.availability = true;
    }
    
    public boolean equals(Book newBook, int byAttributes) {
        if (byAttributes == 0) {
            if (newBook.getNumber() == this.number)
                return true;    
            return false;
        }
        else {
            if (newBook.getName() == this.name)
                return true;
            return false;
        }
    }
    
    public void getDetails() {
        System.out.println(this.number);
        System.out.println(this.name);
        System.out.println(this.category);
        System.out.println(this.availability);
    }
 
    public int getNumber() {
        return this.number;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getCategory() {
        return this.category;
    }
    
    public boolean getStatus() {
        return this.availability;
    }
    
    public void setAvailability(boolean val) {
        this.availability = val;
    }
}