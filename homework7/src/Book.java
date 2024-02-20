// The Element interface represents the "element" part of the visitor pattern,
// which makes all classes that implement the Element interface must provide the ability to accept visitors.
interface Element {
    // The accept method allows a visitor to visit the current element.
    // The Visitor parameter is an interface, indicating that any instance of a class implementing the Visitor interface can visit the element.
    void accept(Visitor visitor);
}

// // The Book class is a concrete element that represents a book in the library. It implements the Element interface,
// so it can accept visitors, such as borrowing and returning books.
class Book implements Element {
    private String title; // The title of the book
    private boolean isBorr; //Whether the book has been borrowed

    // Constructor to init the book title and set it as not borrowed by default.
    public Book(String title) {
        this.title = title;
        this.isBorr = false;
    }

    // Getter method for the book title.
    public String getTitle() {
        return title;
    }

    // Returns the borrowed status of the book.
    public boolean isBorr() {
        return isBorr;
    }

    // setting the borrowed status of the book.
    public void setBorr(boolean borr) {
        isBorr = borr;
    }

    // Implements the accept method to accept a visitor object.

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }
}
