class Book {
    private static String libraryName = "Library"; // Static variable
    private final String isbn; // Final variable
    private String title;
    private String author;

    // Constructor
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void displayBookDetails() {
        if (this instanceof Book) { // Using instanceof
            System.out.println("Library: " + libraryName);
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public static void main(String[] args) {
        Book book1 = new Book("111-222-333", "Java Programming", "RK Singh");
        Book book2 = new Book("111-222-334", "Data Structures", "SP Shukla");
        book1.displayBookDetails();
        book2.displayBookDetails();
        Book.displayLibraryName();
    }
}

