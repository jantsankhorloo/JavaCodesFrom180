public class Shelf {
    private String shelfType;
    private Book[] books;
    
    public Shelf(String newType, Book[] newBooks) {
        this.shelfType = newType;
        this.books = newBooks;
    }
    
    /** 
     * This method adds a new book
     * @parameter newBook. Book Object
     * Do not make any changes to this method
     */
    
    public void addBooks(Book newBook) {
        Book[] replaceBooks = new Book[books.length + 1];
        for (int i = 0; i < replaceBooks.length; i++) {
            if (i == replaceBooks.length - 1) {
                replaceBooks[i] = newBook;
            }
            else {
                replaceBooks[i] = books[i];
            } 
        }
        books = replaceBooks;
    }
    
    /** 
     * This method returns the shelfType
     * @return shelfType. Type String
     */  
    public String getShelfType() {        
        return this.shelfType;
    }
    
    /**
     * This method is called from Library.java when a book is borrowed
     * This method calls the searchBook(), which returns the index of
     * the book being searched. If the value of index = -1, then this
     * method returs a false, denoting that book is not present in the 
     * library. Else it returns a true after changing the status of the 
     * book to false, denoting that the book has been borrowed.
     * @param newBook. Book Object
     * @param byAttributes. Type int. 
     * byAttributes = 0 to search for a book by number
     * byAttributes = 1 to search for a book by name
     * @return true if book is available, else false
     */
    public boolean lendBook(Book newBook, int byAttributes) {        
        int index = searchBook(newBook, byAttributes);
        if (index == -1) {
            return false;
        }
        else {
            
            if (books[index].getStatus() == true) {
                books[index].setAvailability(false);
                return true;  
            }
            else
                return false;
        }
    }
    
    /** 
     * This method is called from Library.java when a library 
     * member wants to return a book
     * This method calls the searchBook(), which returns the index of 
     * this book in the library. This method then uses index to change
     * the status of the returned book to true (true representing 
     * availability of the book)
     * @param newBook. Book Object
     * @param byAttributes. Type int
     * byAttributes = 0 to return a book by number
     * byAttributes = 1 to return a book by name
     * @return true if the book being returned has a valid 
     * index in the library. Else false
     */
    public boolean returnBook(Book newBook, int byAttributes) {
        int index = searchBook(newBook, byAttributes);
        if (index == -1) { // the book has been lent out
            books[index].setAvailability(true);
            return true;
        }
        else {
            return false;
        }        
    }
    
    /**
     * This method calles the searchBook(). If the return value
     * from searchBook is -1, then this method returns a false. 
     * Else this method prints the details of the book inside the shelf, not 
     * the newBook and then returns a true
     * @return true or false. Type boolean
     */
    public boolean getBookDetails(Book newBook, int byAttributes) {
        int index = searchBook(newBook, byAttributes);
        if (index == -1) {
            return false;
        }
        else {
            books[index].getDetails();
            return true;
        }        
    }
    
    /**
     * This method searches for the book in the list of library books
     * If it finds a match, then it returns the index of the book. 
     * Else it returns index = -1
     * @return index. Type int
     */
    public int searchBook(Book newBook, int byAttributes) {
        int result = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(newBook, byAttributes) == true) {
                result = i; 
            }
            else {
                result = -1;  
            }
        }        
        return result;
    }
}
